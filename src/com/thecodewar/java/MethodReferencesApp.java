package com.thecodewar.java;


interface ICal{
    void add(int a, int b);
}

class Calc{

    public static void addition(int a, int b){
        int ans = a+b;
        System.out.println("This is addition of "+a+" and "+ b +" = " + ans);
    }

}


public class MethodReferencesApp {

    public static void main(String[] args) {
        // 1. Static method referencing

        ICal refCal = Calc::addition;
        refCal.add(1,2);

    }
}
