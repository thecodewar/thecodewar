package com.thecodewar.java;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
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
            //the following stream will return false,true,true and true, it should be handled into filter instead of map
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
        //sports.stream().map(String::toUpperCase).findFirst().ifPresent(System.out::println);

        //8. Fabinaci series
        int[] arrNum = {0,1};

        //IntStream.of(arrNum).map(n->n[0])
        String collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .map(String::valueOf) // convert to string
                .collect(Collectors.joining(", "));

        System.out.println("Result : " + collect);



        //9. Iterating list of person
        Person p1 = createPerson("Adarsh");
        Person p2 = createPerson("Zubair");

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);

        List<Person> p = personList.stream().filter(n->n.getName().contains("Z")).collect(Collectors.toList());
        p.forEach(c-> System.out.println(c.getName()));

        //10.
        List<Integer> marks = new ArrayList<>();
        marks.add(0);
        marks.add(5);
        marks.add(10);
        marks.add(15);
        marks.stream().map(m->m+5).collect(Collectors.toList());


    }

    private static Person createPerson(String name){
        Person p = new Person();
        p.setName(name);
        p.setAge(23L);
        p.setId(1L);
        return p;
    }
}
