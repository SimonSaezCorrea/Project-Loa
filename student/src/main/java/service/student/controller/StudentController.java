package service.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
}