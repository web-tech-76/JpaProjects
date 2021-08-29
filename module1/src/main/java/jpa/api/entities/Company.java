package jpa.api.entities;

import jpa.api.entities.embed.Branch;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Embedded
    @AttributeOverride(name = "addr", column = @Column(name = "address"))
    @AttributeOverride(name = "pinCode", column = @Column(name = "zip"))
    private Branch branch;

}
