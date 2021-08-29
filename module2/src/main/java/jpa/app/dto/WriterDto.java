package jpa.app.dto;

import jpa.app.entities.Documents;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.OneToMany;
import java.util.Collection;

@Value
@Data
@NoArgsConstructor
public class WriterDto {

    Integer id=0;

    String name="";

    @OneToMany
    Collection<Documents> documents=null;

}
