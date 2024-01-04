package service.subject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.subject.entity.ScheduleSubjectEntity;
import service.subject.repository.ScheduleSubjectRepository;

import java.util.List;

@Service
public class ScheduleSubjectService {
    @Autowired
    ScheduleSubjectRepository scheduleSubjectRepository;

    public List<ScheduleSubjectEntity> findAll(){
        return scheduleSubjectRepository.findAll();
    }
}
