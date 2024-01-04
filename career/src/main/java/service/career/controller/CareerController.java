package service.career.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.career.entity.CareerEntity;
import service.career.service.CareerService;

import java.util.List;

@RestController
@RequestMapping("/career")
public class CareerController {
    @Autowired
    CareerService careerService;

    @GetMapping("/")
    public ResponseEntity<List<CareerEntity>> listar() {
        List<CareerEntity> careerEntities = careerService.findAll();
        return ResponseEntity.ok(careerEntities);
    }
}
