package service.subject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.subject.entity.ScheduleSubjectEntity;
import service.subject.service.ScheduleSubjectService;

import java.util.List;

@RestController
@RequestMapping("/scheduleSubject")
public class ScheduleSubjectController {
    @Autowired
    ScheduleSubjectService scheduleSubjectService;

    @GetMapping("/")
    public ResponseEntity<List<ScheduleSubjectEntity>> listar() {
        List<ScheduleSubjectEntity> scheduleSubjectEntities = scheduleSubjectService.findAll();
        return ResponseEntity.ok(scheduleSubjectEntities);
    }
}
