package service.career.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.career.service.CareerSubjectService;

@RestController
@RequestMapping("/careerSubject")
public class CareerSubjectController {
    @Autowired
    CareerSubjectService careerSubjectService;
}
