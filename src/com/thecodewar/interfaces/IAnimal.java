package com.thecodewar.interfaces;

public interface IAnimal extends IBase{
    void run();
    default void defaultMethod(){
        System.out.println("This is default method from IAnimal Interface.");
    }
}
