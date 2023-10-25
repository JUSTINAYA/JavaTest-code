import javax.script.ScriptContext;
import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person("justin", 21);
        System.out.println(p1.name);

    }
}

class Person {
    String name;
    int age;

    //构造器
    //无返回值，也不能写void
    //构造器的名字和类名一样
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String pName) {
        name = pName;
    }
}