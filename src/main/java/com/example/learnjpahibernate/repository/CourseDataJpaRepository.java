package com.example.learnjpahibernate.repository;

import com.example.learnjpahibernate.beans.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseDataJpaRepository extends JpaRepository<Course,Long> {
    // here long is data type of primary key
    List<Course> findByAuthor(String author);
    List<Course> findByName (String name);
}
