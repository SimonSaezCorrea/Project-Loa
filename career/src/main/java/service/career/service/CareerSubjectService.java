package service.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.career.repository.CareerSubjectRepository;

@Service
public class CareerSubjectService {
    @Autowired
    CareerSubjectRepository careerSubjectRepository;
}
