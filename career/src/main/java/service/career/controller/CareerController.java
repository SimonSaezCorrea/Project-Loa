package service.career.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.career.service.CareerService;

@RestController
@RequestMapping("/career")
public class CareerController {
    @Autowired
    CareerService careerService;
}
