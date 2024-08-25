package org.idrice2.services;

import org.idrice2.entities.Course;

public interface CourseService {

    Course saveCourse(Course course);
    void deleteCourse(Course course);
    Course findById(long id);

    Iterable<Course> listAllCourses();
    
}
