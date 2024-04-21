package com.example.learnjpahibernate.service;

import com.example.learnjpahibernate.beans.Course;
import com.example.learnjpahibernate.repository.CourseDataJpaRepository;
import com.example.learnjpahibernate.repository.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CourseDataJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseDataJpaRepository jpaDataRepository;

    @Override
    public void run(String... args) throws Exception {
        jpaDataRepository.save(new Course(1L,"AWS DataJPA","AK"));
        jpaDataRepository.save(new Course(2L,"Azure DataJPA","AK"));
        jpaDataRepository.save(new Course(3L,"Devops DataJPA","AK"));

        jpaDataRepository.deleteById(1L);

        System.out.println(jpaDataRepository.findById(2L));
        System.out.println(jpaDataRepository.findById(3L));

        System.out.println(jpaDataRepository.findAll());
        System.out.println(jpaDataRepository.count());

        System.out.println(jpaDataRepository.findByAuthor("AK"));
        System.out.println(jpaDataRepository.findByName("Azure DataJPA"));
    }
}

