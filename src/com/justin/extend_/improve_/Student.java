package com.justin.extend_.improve_;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("小学生" + name + "正在考小学数学");
    }

    public void showInfo() {
        System.out.println("小学生" + name + "年龄" + age + "成绩" + score);
    }
}
