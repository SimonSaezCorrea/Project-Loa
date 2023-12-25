package service.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import service.student.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {
}
