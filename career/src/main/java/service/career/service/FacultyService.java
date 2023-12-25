package service.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.career.repository.FacultyRepository;

@Service
public class FacultyService {
    @Autowired
    FacultyRepository facultyRepository;
}
