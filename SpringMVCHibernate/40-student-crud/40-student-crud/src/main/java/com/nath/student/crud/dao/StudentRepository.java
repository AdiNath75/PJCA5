package com.nath.student.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nath.student.crud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
