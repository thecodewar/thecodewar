package com.thecodewar.interfaces;

@FunctionalInterface
public interface IAlgorithm{
    public void execute();
    default void defaultMethod(){
        System.out.println("Default method in IAlgorithm Interface.");
    }
}
