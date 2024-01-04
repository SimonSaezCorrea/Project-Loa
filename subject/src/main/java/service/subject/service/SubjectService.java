package service.subject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.subject.entity.SubjectEntity;
import service.subject.repository.SubjectRepository;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public List<SubjectEntity> findAll(){
        return subjectRepository.findAll();
    }
}
