package app.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Map;

@Entity
@Data
@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "prof_stud" , joinColumns = @JoinColumn(name = "prof"), inverseJoinColumns = @JoinColumn(name = "stud"))
    @MapKeyColumn(name = "course")
    private Map<String, Student> students;

}
