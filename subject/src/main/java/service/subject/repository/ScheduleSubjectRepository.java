package service.subject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.subject.entity.ScheduleSubjectEntity;

@Repository
public interface ScheduleSubjectRepository extends JpaRepository<ScheduleSubjectEntity, String>{
}
