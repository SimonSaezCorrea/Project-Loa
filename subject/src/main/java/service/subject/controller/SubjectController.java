package service.subject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.subject.entity.SubjectEntity;
import service.subject.service.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("/")
    public ResponseEntity<List<SubjectEntity>> listar() {
        List<SubjectEntity> subjectEntities = subjectService.findAll();
        return ResponseEntity.ok(subjectEntities);
    }
}
