package com.example.BasicConceptsRefresh.service.impl;

import com.example.BasicConceptsRefresh.service.MyFunctionalInterface;

import java.util.Date;

public class MyFunctionalInterfaceImpl {

    public static void main(String[] args) {

        MyFunctionalInterface myInstance = msg -> System.out.println("the Date is: "+msg);

        myInstance.sayMessage(String.valueOf(new Date()));
    }
}
