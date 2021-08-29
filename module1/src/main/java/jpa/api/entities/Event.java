package jpa.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "event")
public class Event {

    @Id
    @GenericGenerator(name =  "generic_generator" ,  strategy = "org.hibernate.id.UUIDGenerator",
                            // strategy = "org.hibernate.id.UUIDHexGenerator" ,
                            parameters = {@Parameter(name = "separator" , value = "-")})
    @GeneratedValue(generator = "generic_generator")
    private String id;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
