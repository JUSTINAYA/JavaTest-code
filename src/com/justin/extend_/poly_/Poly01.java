package com.justin.extend_.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Animal animal = new Dog("yellow");
        Food food = new Bone("big bone");
        tom.feed(animal, food);

        animal = new Cat("hana");
        food = new Fish("huanghua");
        tom.feed(animal, food);
    }
}
