package com.example.BasicConceptsRefresh.service.impl;

import com.example.BasicConceptsRefresh.model.Employee;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {

        //Sort employees on basis of age and salary
        List<Employee> employees = List.of(
                Employee.builder().empId(1).empName("Asif").age(33).salary(120000).build(),
                Employee.builder().empId(2).empName("Anisa").age(30).salary(12096.90).build(),
                Employee.builder().empId(3).empName("Gaurav").age(31).salary(78654).build(),
                Employee.builder().empId(5).empName("Cyrus").age(44).salary(90886543).build(),
                Employee.builder().empId(8).empName("Rahul").age(39).salary(450000).build()
        );

        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getAge() <= 40 && e.getSalary() > 100000)
                .sorted(Comparator.comparing(Employee::getAge)
                        .thenComparing(Employee::getSalary))
                .toList();

        filteredEmployees.forEach(System.out::println);
    }
    }

