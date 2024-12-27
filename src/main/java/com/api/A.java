package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(1,2,3,4,5);
        Optional<Integer> min = data.stream().min(Integer::compareTo);
        System.out.println(min.get());
    }
}
