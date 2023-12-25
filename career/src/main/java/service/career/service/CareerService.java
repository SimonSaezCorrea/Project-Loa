package service.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.career.repository.CareerRepository;

@Service
public class CareerService {
    @Autowired
    CareerRepository careerRepository;
}
