package service.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.student.entity.CalificationEntity;
import service.student.repository.CalificationRepository;

import java.util.List;

@Service
public class CalificationService {
    @Autowired
    CalificationRepository calificationRepository;

    public List<CalificationEntity> findAll(){
        return calificationRepository.findAll();
    }
}
