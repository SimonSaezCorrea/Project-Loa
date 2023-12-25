package service.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.student.entity.StudentScheduleSubjectEntity;

@Repository
public interface StudentScheduleSubjectRepository extends JpaRepository<StudentScheduleSubjectEntity, String>{
}
