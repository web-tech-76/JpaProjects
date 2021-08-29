package jpa.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Product {

    @Id
    private Integer id;

    private String name;

    private Double price;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

}
