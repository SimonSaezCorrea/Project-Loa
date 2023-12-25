package service.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.student.entity.CalificationEntity;
import service.student.service.CalificationService;

import java.util.List;

@RestController
@RequestMapping("/calification")
public class CalificationController {
    @Autowired
    CalificationService calificationService;

    @GetMapping("/")
    public ResponseEntity<List<CalificationEntity>> listar() {
        List<CalificationEntity> calificationEntities = calificationService.findAll();
        return ResponseEntity.ok(calificationEntities);
    }
}
