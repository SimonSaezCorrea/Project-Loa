package service.subject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "dependence")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DependenceEntity {
    @Id
    @NotNull
    private int id;

    private String id_subjectDependence;
    private String id_subjectSource;
}
