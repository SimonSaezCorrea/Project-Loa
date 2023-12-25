package service.career.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "career_subject")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CareerSubjectEntity {
    @Id
    private int id;

    private String id_career;
    private String id_subject;
}
