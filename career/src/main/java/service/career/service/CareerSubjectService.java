package service.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.career.entity.CareerSubjectEntity;
import service.career.repository.CareerSubjectRepository;

import java.util.List;

@Service
public class CareerSubjectService {
    @Autowired
    CareerSubjectRepository careerSubjectRepository;

    public List<CareerSubjectEntity> findAll(){
        return careerSubjectRepository.findAll();
    }
}
