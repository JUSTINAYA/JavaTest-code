public class Test1 {
    public static void main(String[] args) {
        test t = new test();

        System.out.println(t.score("cx", 100, 100, 100));

    }
}

class test {
    public String score(String name, int... scores) {
        int res = 0;
        for (int i = 0; i < scores.length; i++) {
            res += scores[i];
        }

        return name + "的得分是" + res;
    }
}