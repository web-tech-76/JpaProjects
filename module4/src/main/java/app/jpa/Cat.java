package app.jpa;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Cat extends Animal {

    private String color;


}
