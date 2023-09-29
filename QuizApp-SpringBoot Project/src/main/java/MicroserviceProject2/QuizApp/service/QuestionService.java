package MicroserviceProject2.QuizApp.service;

import MicroserviceProject2.QuizApp.Repository.QuestionRepository;
import MicroserviceProject2.QuizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public ResponseEntity<List<Question>> getAllQuestion(){
        try {
            //return list of question
            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<List<Question>> getQuestionByCategory(String category) {
            return new ResponseEntity<>(questionRepository.findByCategory(category), HttpStatus.OK);
    }

    public ResponseEntity<Question> addQuestion(Question question) {
        return new ResponseEntity<>( questionRepository.save(question),HttpStatus.CREATED);
    }
}
