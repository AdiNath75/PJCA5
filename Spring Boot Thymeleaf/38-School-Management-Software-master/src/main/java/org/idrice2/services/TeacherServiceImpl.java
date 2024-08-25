package org.idrice2.services;

import org.idrice2.entities.Teachers;
import org.idrice2.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    private TeacherRepository teacherRepository;

    @Autowired
    public void setTeacherRepository(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Iterable<Teachers> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public void saveTeacher(Teachers teacher) {
        teacherRepository.save(teacher);
        
    }

    @Override
    public Teachers findById(long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public void deleteTeacher(Teachers teachers) {
        teacherRepository.delete(teachers);
        
    }
    
}
