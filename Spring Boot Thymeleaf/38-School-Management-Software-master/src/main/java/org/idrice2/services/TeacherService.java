package org.idrice2.services;


import org.idrice2.entities.Teachers;

public interface TeacherService {

Iterable<Teachers> getAllTeachers();

void saveTeacher(Teachers teacher);

Teachers findById(long id);

void deleteTeacher(Teachers teachers);
    
}
