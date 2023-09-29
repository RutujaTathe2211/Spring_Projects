package MicroserviceProject2.QuizApp.Repository;

import MicroserviceProject2.QuizApp.model.Quiz;
import org.springframework.boot.autoconfigure.web.servlet.JerseyApplicationPath;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}
