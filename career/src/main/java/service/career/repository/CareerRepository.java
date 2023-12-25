package service.career.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.career.entity.CareerEntity;

@Repository
public interface CareerRepository extends JpaRepository<CareerEntity, Integer> {
}
