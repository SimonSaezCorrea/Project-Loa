package service.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.student.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, String> {
}
