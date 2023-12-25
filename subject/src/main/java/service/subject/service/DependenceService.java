package service.subject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.subject.repository.DependenceRepository;

@Service
public class DependenceService {
    @Autowired
    DependenceRepository dependenceRepository;
}
