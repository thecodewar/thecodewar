package com.thecodewar.java;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        //1.
        Stream.of("a","b","d","c").sorted().findFirst().ifPresent(System.out::println);

        //2.
        System.out.println(IntStream.range(1,10).sum());

        String[] nameArray = new String[]{"Adarsh","Haider","Wajid","Ahsun"};
        // 3. Stream.of can also be used.
        Arrays.stream(nameArray).filter(n-> n!="Adarsh").forEach(System.out::println);
            //the following stream will return false,true,true and true
        //Stream.of(nameArray).map(n-> n!="Adarsh").forEach(System.out::println);

        // 4. find average of squares of numbers.
        int[] numbers = {2,8};
        Arrays.stream(numbers).map(n->n*n).average().ifPresent(System.out::println);

        //5.
        List<String> petName = new ArrayList<>();
        petName.add("billi");
        petName.add("Murgi");
        petName.add("bakri");
        petName.stream().map(String::toUpperCase).filter(n-> !n.equals("BILLI")).forEach(System.out::println);

        //The following won't work due to map
        //Stream.of(petName).map(String::toUpperCase).filter(n-> !n.equals("BILLI")).forEach(System.out::println);


        //6. Reading a file in stream
        try{
            Stream<String> file = Files.lines(Paths.get("C://Users//Adarsh Khalique//Desktop//Goal.txt"));
            file.sorted().filter(n-> n.length()<7).forEach(n-> System.out.println(n));
            List<String> newFileAsList = file.collect(Collectors.toList());
            newFileAsList.forEach(System.out::println);

        }catch (Exception e){

        }


        //7. As Array list
        List<String> sports = Arrays.asList("football","cricket","table tennis");
        sports.stream().map(String::toUpperCase).forEach(System.out::println);


        //8. Iterating list of person
      /*  Person p1 = createPerson("Adarsh");
        Person p2 = createPerson("Zubair");

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);*/




    }

    private static Person createPerson(String name){
        Person p = new Person();
        p.setName(name);
        p.setAge(23L);
        p.setId(1L);
        return p;
    }
}
