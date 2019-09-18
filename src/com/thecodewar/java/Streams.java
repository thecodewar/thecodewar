package com.thecodewar.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {


        Stream.of("a","b","d","c").sorted().findFirst().ifPresent(System.out::println);

        System.out.println(IntStream.range(1,10).sum());

        String[] nameArray = new String[]{"Adarsh","Haider","Wajid","Ahsun"};
        //Stream.of can also be used.
        Arrays.stream(nameArray).sorted().filter(n-> n!="Adarsh").forEach(System.out::println);

        //find average of squares of numbers.
        int[] numbers = {2,8};
        Arrays.stream(numbers).map(n->n*n).average().ifPresent(System.out::println);

        



    }
}
