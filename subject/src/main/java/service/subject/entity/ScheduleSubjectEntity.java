package service.subject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "schedule_subject")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScheduleSubjectEntity {
    @Id
    @NotNull
    private int id;

    private String id_subject;
    private int id_schedule;
    private String day;
}
