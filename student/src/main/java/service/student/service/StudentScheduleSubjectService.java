package service.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.student.entity.CalificationEntity;
import service.student.entity.StudentScheduleSubjectEntity;
import service.student.repository.StudentScheduleSubjectRepository;

import java.util.List;

@Service
public class StudentScheduleSubjectService {
    @Autowired
    StudentScheduleSubjectRepository studentScheduleSubjectRepository;

    public List<StudentScheduleSubjectEntity> findAll(){
        return studentScheduleSubjectRepository.findAll();
    }
}
