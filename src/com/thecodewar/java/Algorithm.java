package com.thecodewar.java;

import com.thecodewar.interfaces.IAlgorithm;

public class Algorithm implements IAlgorithm {

    public static void display(){
        System.out.println("This is Test Class with static display method.");
    }

    @Override
    public void execute() {
        System.out.println("This is Test Class with execute method.");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Override default method.");
    }


}
