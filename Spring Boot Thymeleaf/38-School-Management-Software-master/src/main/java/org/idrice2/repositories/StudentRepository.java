package org.idrice2.repositories;


import org.idrice2.entities.Student;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findById(long id);

   // @Query(value = "SELECT s FROM Student s WHERE Student.sui LIKE : classe ")
   // List<Student> findBySui(@Param("classe") Class<? extends Classe> s);

}
