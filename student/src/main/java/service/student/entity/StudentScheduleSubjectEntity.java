package service.student.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_schedule_subject")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentScheduleSubjectEntity {
    @Id
    @NotNull
    private String rut;
    private String id_schedule_subject;
}
