package jpa.app.entities;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;
import java.util.List;

@Embeddable
@Data
public class StoreDetails {

    @ManyToMany
    List<Store> stores;

}
