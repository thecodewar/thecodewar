package com.thecodewar.java;


import java.util.Arrays;
import java.util.List;

interface ICal{
    void add(int a, int b);
}

//Functional Interface
interface Messanger{
    Message getMessage(String msg);
}

class Message{
    Message(String msg){
        System.out.println("Message is " + msg);
    }
}

class Calc{

    public static void addition(int a, int b){
        int ans = a+b;
        System.out.println("This is addition of "+a+" and "+ b +" = " + ans);
    }

    public void letsAdd(int a, int b){
        int ans = a+b;
        System.out.println("This is lets add method" + ans);
    }

}

public class MethodReferencesApp {

    public static void main(String[] args) {
        // 1. Static method referencing
        ICal refCal = Calc::addition;
        refCal.add(1,2);

        // 2. Reference to a non static method or Instance Method
        // Object construction statement for Calc
        Calc calc = new Calc();
        refCal = calc::letsAdd;
        refCal.add(2,3);

        // 3. Reference to Constructor
        Messanger msg = Message::new;
        msg.getMessage("hellloooo");

        // 4. printing the list of objects
        List<String> names = Arrays.asList("Adarsh","Asad","Wajid","Haider");
        //Method Reference
        names.forEach(System.out::println);

        //Lambda expression
        names.forEach(n -> System.out.println(n));

    }
}
