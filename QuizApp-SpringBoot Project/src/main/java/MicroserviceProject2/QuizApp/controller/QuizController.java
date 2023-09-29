package MicroserviceProject2.QuizApp.controller;

import MicroserviceProject2.QuizApp.model.Question;
import MicroserviceProject2.QuizApp.model.QuestionWrapper;
import MicroserviceProject2.QuizApp.model.Response;
import MicroserviceProject2.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ,@RequestParam String title){
        return quizService.createQuiz(category,numQ,title);
    }
    @GetMapping("/quizId/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable Integer id){
       return  quizService.getQuizQuestions(id);
    }

    //for calculating score of quiz
@PostMapping("submit/{id}")
    public ResponseEntity<Integer>submitQuiz(@PathVariable Integer id, @RequestBody List<Response> response){
        return  quizService.calculateResult(id,response);

}
}
