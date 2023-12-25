package service.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.student.repository.CalificationRepository;

@Service
public class CalificationService {
    @Autowired
    CalificationRepository calificationRepository;
}
