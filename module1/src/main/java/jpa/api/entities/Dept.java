package jpa.api.entities;

import jpa.api.entities.embed.DeptPK;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "department")
public class Dept {

    @EmbeddedId
    private DeptPK id;

    private String name;
}
