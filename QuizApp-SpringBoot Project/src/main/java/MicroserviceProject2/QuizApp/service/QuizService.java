package MicroserviceProject2.QuizApp.service;

import MicroserviceProject2.QuizApp.Repository.QuestionRepository;
import MicroserviceProject2.QuizApp.Repository.QuizRepository;
import MicroserviceProject2.QuizApp.model.Question;
import MicroserviceProject2.QuizApp.model.QuestionWrapper;
import MicroserviceProject2.QuizApp.model.Quiz;
import MicroserviceProject2.QuizApp.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizRepository quizRepository;
    @Autowired
    QuestionRepository questionRepository;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions=questionRepository.findRandomQuestionByCategory(category,numQ);
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionList(questions);
        quizRepository.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);

    }


    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        //data present or not :use optional
        Optional<Quiz> quiz=quizRepository.findById(id);
        List<Question> questionFromDB=quiz.get().getQuestionList();
        List<QuestionWrapper> questionForUser=new ArrayList<>();
        for(Question q:questionFromDB){
            QuestionWrapper qw= new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
            questionForUser.add(qw);
        }

        return new ResponseEntity<>(questionForUser,HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> response) {
        Quiz quiz=quizRepository.findById(id).get();
        List<Question> questions=quiz.getQuestionList();

        int right=0;
        int i=0;
        for(Response response1:response){
            if(response1.getResponse().equals(questions.get(i).getRightAnswer()))
                right++;

            i++;
        }
        return new ResponseEntity<>(right,HttpStatus.OK);
    }
}
