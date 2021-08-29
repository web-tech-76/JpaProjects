package jpa.app.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "teacher_student",
               joinColumns = @JoinColumn(name = "teacher"),
               inverseJoinColumns = @JoinColumn(name = "student"))
    private List<Student> students;
}
