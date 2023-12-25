package service.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.student.entity.CalificationEntity;

@Repository
public interface CalificationRepository extends JpaRepository<CalificationEntity, Integer> {
}
