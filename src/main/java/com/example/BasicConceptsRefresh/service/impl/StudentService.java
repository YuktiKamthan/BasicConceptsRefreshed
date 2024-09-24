package com.example.BasicConceptsRefresh.service.impl;

import com.example.BasicConceptsRefresh.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StudentService {

    public static void main(String[] args) {

        List<Student> students = Stream.of(Student.builder().rollNo(1).age(23).name("Pat").build())
                .toList();

        Optional<Student> student = students.stream().filter(s -> s.getRollNo()==1).findFirst();

        student.ifPresentOrElse( s -> System.out.println("Student found: "+s),
                () -> System.out.println("No student with this roll no exits!!"));
    }
}
