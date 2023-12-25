package service.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.student.repository.StudentScheduleSubjectRepository;

@Service
public class StudentScheduleSubjectService {
    @Autowired
    StudentScheduleSubjectRepository studentScheduleSubjectRepository;
}
