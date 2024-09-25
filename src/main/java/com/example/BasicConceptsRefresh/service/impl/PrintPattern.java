package com.example.BasicConceptsRefresh.service.impl;

public class PrintPattern {

    public static void main(String[] args) {

        String s = "*";

        for(int i=1;i<=5;i++){
            System.out.println();
            for(int j=i;j>=1;j--)
            {
                System.out.print(s);
            }
        }



    }
}