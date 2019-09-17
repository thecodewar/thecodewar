package com.thecodewar.java;
import com.thecodewar.interfaces.IAlgorithm;
import com.thecodewar.interfaces.IBase;
import com.thecodewar.interfaces.ICalculator;

public class Main {

    public static int i = 0;

    public static void main(String[] args) {

        // 1. Lambda expression with zero parameter and using static variable
        IAlgorithm algorithm = () -> {
            System.out.println("This is execute method" + i);
            ++i;
        };
        algorithm.execute();
        System.out.println(i);


        // 2. Lambda expression with two parameters and passing local variable.
        int num = 5;
        ICalculator calculator = (a,b) -> {return a+b+num;};
        System.out.println(calculator.add(3,4));




        // 3. This gives error that the num2 should be final or effectively final
        /*int num2 = 5;
        ICalculator calculator2 = (a,b) -> {
                num2 =a+b;
            return  num2;
        };*/


        Person person = new Person();
        // 4. Lambda expression with zero parameter and using Local variable and instance variables
        IAlgorithm algorithm2 = () -> {
            int a = 5;
            int j =5;
            int ans = a+j;
            person.setName("adarsh");
            System.out.println("This is using variable under lambda expression: " + ans);
        };
        algorithm2.execute();
        System.out.println(person.getName()); // Output is Adarsh

        //Using default method which is overridding defaultMethod.
        IAlgorithm iAlgorithm = new Algorithm();
        iAlgorithm.defaultMethod();

        /**
         * This method is interesting as IBase and IAnimal both have the default method but always child interface default method is executed
         * We can discuss it later.
         *
         */
        IBase animal = new Animal();
        animal.defaultMethod();

    }
}
