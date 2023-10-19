public class Recursion {
    public static void main(String[] args) {
        T t1 = new T();
//        System.out.println(t1.fibonacci(7));
        System.out.println(t1.peach(8));
    }
}

class T {
    //使用递归方式求斐波那契数列1,1,2,3,5,8,13...给你一个整数n，求出它的值
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!以后每天猴子都吃其中的一半，
    // ，然后再多吃一个,当到第10天时
    //想再吃时(即还没吃)，发现只有1个桃子了。问题:最初共多少个桃子?
    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day in 1-10");
            return -1;
        }
    }


}