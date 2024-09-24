package com.example.BasicConceptsRefresh.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Employee {

    private int empId;
    private String empName;
    private int age;
    private double salary;
}
