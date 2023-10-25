package com.justin.extend_;

//模拟小学生考试情况
public class Pupil {
    public String name;
    public int age;
    private double score;

    public Pupil() {
    }

    public Pupil(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     *
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Pupil{name = " + name + ", age = " + age + ", score = " + score + "}";
    }

    public void testing() {
        System.out.println("小学生" + name + "正在考小学数学");
    }

    public void showInfo() {
        System.out.println("小学生" + name + "年龄" + age + "成绩" + score);
    }
}
