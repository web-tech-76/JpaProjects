package jpa.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {

    @Id
    @TableGenerator(
            name = "seq_generator",
            pkColumnName = "key_name",
            pkColumnValue = "seq_name",
            valueColumnName = "key_value",
            allocationSize = 5,
            initialValue = 1
    )
    @GeneratedValue(strategy = GenerationType.TABLE , generator = "seq_generator")
    private Integer id;

    private String type;
}
