package service.student.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentEntity {
    @Id
    @NotNull
    private String rut;
    private String names;
    private String last_names;
    private LocalDate registration_date;
    private String id_career;
    private String semester_schedule;
}
