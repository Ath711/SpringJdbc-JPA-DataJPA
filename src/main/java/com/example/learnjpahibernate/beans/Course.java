package com.example.learnjpahibernate.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity(name = "CourseDetails") // <- can change table name using this
public class Course {
    @Id
    private Long id;
    //    @Column(name = "name")  <- can change column name using this
    private String name;
    //    @Column(name = "author")
    private String author;

    public Course(long l) {
    }
}
