package jpa.api.entities;

import jpa.api.entities.pk.DepartmentPK;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@IdClass(value = DepartmentPK.class)
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "id")
    private Integer number;

    @Id
    private String code;

    private String name;
}
