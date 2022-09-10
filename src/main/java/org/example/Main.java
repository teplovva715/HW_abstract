package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> values =  Arrays.asList(
                Arrays.asList(8,5,6),
                Arrays.asList(2,7,4,8,0,1,76,16));
        System.out.println(values);
        System.out.println("---- solution ----");
        List<Integer> resultList = values.stream().flatMap(l -> l.stream())
                .collect(Collectors.toList());
        System.out.println("a) " + resultList);
        resultList = resultList.stream().sorted()
                .collect(Collectors.toList());
        System.out.println("b) " + resultList);
        resultList.add(null);
        System.out.println("c) " + resultList);
        resultList = resultList.stream().map(l -> Optional.ofNullable(l).orElse(55))
                .collect(Collectors.toList());
        System.out.println("d) " + resultList);
    }
}
