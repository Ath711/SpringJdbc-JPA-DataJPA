package com.example.learnjpahibernate.service;

import com.example.learnjpahibernate.beans.Course;
import com.example.learnjpahibernate.repository.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository jpaRepository;
    @Override
    public void run(String... args) throws Exception {
        jpaRepository.insert(new Course(1L,"AWS JPA","AK"));
        jpaRepository.insert(new Course(2L,"Azure JPA","AK"));
        jpaRepository.insert(new Course(3L,"Devops JPA","AK"));

        jpaRepository.deleteById(1L);

        System.out.println(jpaRepository.findById(2L));
        System.out.println(jpaRepository.findById(3L));
    }
}

