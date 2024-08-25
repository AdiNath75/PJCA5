package org.idrice2.repositories;

import org.idrice2.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    Course findById(long id);
}