package service.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import service.student.entity.CalificationEntity;

public interface CalificationRepository extends JpaRepository<CalificationEntity, Integer> {
}
