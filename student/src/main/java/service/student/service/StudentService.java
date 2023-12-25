package service.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.student.entity.StudentEntity;
import service.student.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<StudentEntity> findAll(){
        return studentRepository.findAll();
    }
}
