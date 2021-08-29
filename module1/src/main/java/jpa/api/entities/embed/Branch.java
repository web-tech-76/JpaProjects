package jpa.api.entities.embed;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@Data
public class Branch {

    private String addr;

    private String city;

    private int pinCode;

}
