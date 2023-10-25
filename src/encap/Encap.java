package encap;

public class Encap {
    public static void main(String[] args) {
        
    }
}

class Human {
    public String name;
    private int age;
    private double salary;
    private String job;

    public Human() {
    }

    public Human(String name, int age, double salary, String job) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.job = job;
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
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 获取
     *
     * @return job
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置
     *
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return "encap.Person{name = " + name + ", age = " + age + ", salary = " + salary + ", job = " + job + "}";
    }
}

