package service.subject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.subject.entity.DependenceEntity;

@Repository
public interface DependenceRepository extends JpaRepository<DependenceEntity, Integer> {
}
