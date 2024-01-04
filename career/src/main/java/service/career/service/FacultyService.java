package service.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.career.entity.FacultyEntity;
import service.career.repository.FacultyRepository;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    FacultyRepository facultyRepository;

    public List<FacultyEntity> findAll(){
        return facultyRepository.findAll();
    }
}
