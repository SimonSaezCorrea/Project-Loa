package service.subject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.subject.entity.DependenceEntity;
import service.subject.repository.DependenceRepository;

import java.util.List;

@Service
public class DependenceService {
    @Autowired
    DependenceRepository dependenceRepository;

    public List<DependenceEntity> findAll(){
        return dependenceRepository.findAll();
    }
}
