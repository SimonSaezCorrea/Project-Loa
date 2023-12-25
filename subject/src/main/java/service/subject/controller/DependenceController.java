package service.subject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.subject.service.DependenceService;

@RestController
@RequestMapping("/dependence")
public class DependenceController {
    @Autowired
    DependenceService dependenceService;
}
