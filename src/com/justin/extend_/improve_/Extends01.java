package com.justin.extend_.improve_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "justin";
        pupil.age = 21;
        pupil.testing();
        pupil.setScore(100);
        pupil.showInfo();
        System.out.println("======");
        Graduate graduate = new Graduate();
        graduate.name = "lisa";
        graduate.age = 19;
        graduate.testing();
        graduate.setScore(90);
        graduate.showInfo();
    }
}
