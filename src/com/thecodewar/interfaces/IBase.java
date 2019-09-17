package com.thecodewar.interfaces;


public interface IBase {

    default void defaultMethod(){
        System.out.println("This is default method from IBase Interface.");
    }
}
