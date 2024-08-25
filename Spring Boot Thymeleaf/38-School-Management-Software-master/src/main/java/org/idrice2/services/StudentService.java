package org.idrice2.services;


import org.idrice2.entities.Student;

public interface StudentService {

    Iterable<Student> listAllStudents();

    void saveStudent(Student student);

    long getLastId();
    
    

    //List<Student> findByClasse(Class<? extends Classe> s);
}
