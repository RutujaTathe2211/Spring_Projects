package com.example.springDataJPA.springrelationship.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "course")//object of course
public class CourseMaterial {
    @Id
    @SequenceGenerator(name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence")

    private Long courseMaterialId;
    private String url;
    //cascading are required to save the course information before saving coursematerial
    @OneToOne(cascade = CascadeType.ALL
    ,fetch = FetchType.LAZY
            //enter course is mandatory
    ,optional = false
    )
    @JoinColumn(
            name = "courseId",
            referencedColumnName = "courseId"
    )//one more column with name coursedId that is foreign key
    private Course course;
}
