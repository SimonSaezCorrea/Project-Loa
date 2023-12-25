package service.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.student.entity.StudentEntity;
import service.student.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public ResponseEntity<List<StudentEntity>> listar() {
        List<StudentEntity> studentEntities = studentService.findAll();
        return ResponseEntity.ok(studentEntities);
    }
}
