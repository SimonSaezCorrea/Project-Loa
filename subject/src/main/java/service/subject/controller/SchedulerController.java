package service.subject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.subject.entity.ScheduleEntity;
import service.subject.service.ScheduleService;

import java.util.List;

@RestController
@RequestMapping("/scheduler")
public class SchedulerController {
    @Autowired
    ScheduleService scheduleService;

    @GetMapping("/")
    public ResponseEntity<List<ScheduleEntity>> listar() {
        List<ScheduleEntity> scheduleEntities = scheduleService.findAll();
        return ResponseEntity.ok(scheduleEntities);
    }
}
