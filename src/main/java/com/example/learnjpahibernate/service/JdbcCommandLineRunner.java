package com.example.learnjpahibernate.service;

import com.example.learnjpahibernate.beans.Course;
import com.example.learnjpahibernate.repository.JdbcRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class JdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private JdbcRepositiory repositiory;

    @Override
    public void run(String... args) throws Exception {
        repositiory.insert(new Course(1L,"AWS","AK"));
        repositiory.insert(new Course(2L,"Azure","AK"));
        repositiory.insert(new Course(3L,"Devops","AK"));

        repositiory.deleteById(1L);

        System.out.println(repositiory.selectById(2L));
        System.out.println(repositiory.selectById(3L));
    }
}

