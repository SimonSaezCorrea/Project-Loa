package service.subject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.subject.entity.DependenceEntity;
import service.subject.service.DependenceService;

import java.util.List;

@RestController
@RequestMapping("/dependence")
public class DependenceController {
    @Autowired
    DependenceService dependenceService;

    @GetMapping("/")
    public ResponseEntity<List<DependenceEntity>> listar() {
        List<DependenceEntity> dependenceEntities = dependenceService.findAll();
        return ResponseEntity.ok(dependenceEntities);
    }
}
