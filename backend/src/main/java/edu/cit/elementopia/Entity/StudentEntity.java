package edu.cit.elementopia.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class StudentEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String name;
    private int age;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private TeacherEntity teacher;
}
