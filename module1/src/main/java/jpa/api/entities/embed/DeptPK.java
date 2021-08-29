package jpa.api.entities.embed;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class DeptPK implements Serializable {

    private Integer id;

    private String code;
}
