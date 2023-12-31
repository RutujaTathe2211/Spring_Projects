package MicroserviceProject2.QuizApp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questionList;

}
