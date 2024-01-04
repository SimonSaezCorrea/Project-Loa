package service.career.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.career.entity.CareerSubjectEntity;
import service.career.service.CareerSubjectService;

import java.util.List;

@RestController
@RequestMapping("/careerSubject")
public class CareerSubjectController {
    @Autowired
    CareerSubjectService careerSubjectService;

    @GetMapping("/")
    public ResponseEntity<List<CareerSubjectEntity>> listar() {
        List<CareerSubjectEntity> careerSubjectEntities = careerSubjectService.findAll();
        return ResponseEntity.ok(careerSubjectEntities);
    }
}
