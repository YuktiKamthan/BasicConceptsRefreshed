package com.example.BasicConceptsRefresh.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromArray {



    public static void main(String[] args) {

        Integer[] arr = {1,2,2,3,4,4,5,5};

        List<Integer> uniqueElements = Arrays.stream(arr)
                                        .distinct()
                                        .toList();

    Integer[] arr2 =  IntStream.range(0,arr.length)
                .mapToObj(i -> i < uniqueElements.size() ? uniqueElements.get(i) : null)
                .toArray(Integer[]::new);

         System.out.println(Arrays.toString(arr2));



    }
}
