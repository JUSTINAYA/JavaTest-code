package com.justin.extend_.poly_;

public class Master {
    private String name;

    public Master() {
    }

    public Master(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Master{name = " + name + "}";
    }

    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal.getName() + "吃" + food.getName());
    }
}
