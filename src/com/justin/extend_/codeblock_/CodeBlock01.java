package com.justin.extend_.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie bleach = new Movie("bleach");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    public Movie() {
    }

    //构造器
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影屏幕打开...");
    }

    public Movie(String name) {

        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
