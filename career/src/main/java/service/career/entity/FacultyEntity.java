package service.career.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "faculty")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FacultyEntity {
    @Id
    @NotNull
    private String id;

    private String name;
}
