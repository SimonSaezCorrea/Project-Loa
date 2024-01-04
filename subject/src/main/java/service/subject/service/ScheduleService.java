package service.subject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.subject.entity.ScheduleEntity;
import service.subject.repository.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;

    public List<ScheduleEntity> findAll(){
        return scheduleRepository.findAll();
    }
}
