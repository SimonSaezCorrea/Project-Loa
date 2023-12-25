package service.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.student.entity.StudentScheduleSubjectEntity;
import service.student.service.StudentScheduleSubjectService;

import java.util.List;

@RestController
@RequestMapping("/studentScheduleSubject")
public class StudentScheduleSubjectController {
    @Autowired
    StudentScheduleSubjectService studentScheduleSubjectService;

    @GetMapping("/")
    public ResponseEntity<List<StudentScheduleSubjectEntity>> listar() {
        List<StudentScheduleSubjectEntity> studentScheduleSubjectEntities = studentScheduleSubjectService.findAll();
        return ResponseEntity.ok(studentScheduleSubjectEntities);
    }
}
