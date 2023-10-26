package com.justin.extend_.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}


abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}