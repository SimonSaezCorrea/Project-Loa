package service.career.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.career.entity.CareerSubjectEntity;

@Repository
public interface CareerSubjectRepository extends JpaRepository<CareerSubjectEntity, String> {
}
