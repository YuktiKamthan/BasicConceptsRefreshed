package com.example.BasicConceptsRefresh.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@Builder
@ToString
public class Student {

    private int rollNo;
    private String  name;
    private int age;
    private String course;
    private Date gradYear;
}
