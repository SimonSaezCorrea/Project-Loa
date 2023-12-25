package service.student.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "calification")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CalificationEntity {
    @Id
    @NotNull
    private int id;
    private int calification;
    private String id_subject;
    private String rut;
}
