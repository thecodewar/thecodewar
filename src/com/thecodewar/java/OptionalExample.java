package com.thecodewar.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        /**
         * There are three options in Optional Class
         * 1. .of
         * 2. empty()
         * 3. ofNullable
         */

        Optional<String> gender = Optional.of("Male");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

        List<Person> personList = new ArrayList<>();
        personList.add(createPerson("Adarsh"));
        personList.add(createPerson("Ahmed"));

        Optional<Person> p = Optional.of(createPerson("Ahmed"));
        //p.flatMap(n->n.)




    }

    private static Person createPerson(String name){
        Person p = new Person();
        p.setName(name);
        p.setAge(23L);
        p.setId(1L);
        p.setCar(createCar());
        return p;
    }
    private static Car createCar(){
        Car c = new Car();
        c.setId(1);
        c.setName("Mehran");
        c.setModel("2019");
        return c;
    }
}
