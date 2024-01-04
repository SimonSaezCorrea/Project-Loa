package service.career.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.career.entity.FacultyEntity;
import service.career.service.FacultyService;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    FacultyService facultyService;

    @GetMapping("/")
    public ResponseEntity<List<FacultyEntity>> listar() {
        List<FacultyEntity> facultyEntities = facultyService.findAll();
        return ResponseEntity.ok(facultyEntities);
    }
}
