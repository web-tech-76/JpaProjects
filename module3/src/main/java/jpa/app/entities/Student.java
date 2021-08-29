package jpa.app.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "students")
    private List<Teacher> teachers;

}
