package service.career.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "career")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CareerEntity {
    @Id
    @NotNull
    private String id;

    private String name;
    private String id_faculty;
}
