package jpa.api.entities.embed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    private String address;

    private String city;

    private int zip;
}
