package service.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.career.entity.CareerEntity;
import service.career.repository.CareerRepository;

import java.util.List;

@Service
public class CareerService {
    @Autowired
    CareerRepository careerRepository;

    public List<CareerEntity> findAll(){
        return careerRepository.findAll();
    }
}
