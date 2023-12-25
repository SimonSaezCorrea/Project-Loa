package service.subject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.subject.repository.ScheduleSubjectRepository;

@Service
public class ScheduleSubjectService {
    @Autowired
    ScheduleSubjectRepository scheduleSubjectRepository;
}
