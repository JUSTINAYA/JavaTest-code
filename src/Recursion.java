public class Recursion {
    public static void main(String[] args) {
        T t1 = new T();
//        System.out.println(t1.fibonacci(7));

//        System.out.println(t1.peach(8));

        /*
        int[][] map = new int[8][7];
        for (int i = 0; i < map[i].length; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        t1.findWay(map, 1, 1);
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        */


//        t1.hanoiTower(3 , 'A', 'B', 'C');




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

    //迷宫问题
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {//down
                    return true;
                } else if (findWay(map, i, j + 1)) {//right
                    return true;
                } else if (findWay(map, i - 1, j)) {//up
                    return true;
                } else if (findWay(map, i, j - 1)) {//left
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            }
        }
        return false;
    }

    //汉诺塔
    //num表示要移动的个数，abc分别表示A塔，B塔，C塔
    public void hanoiTower(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //a to b ,use c
            hanoiTower(num - 1, a, c, b);
            System.out.println(a + "->" + c);
            //b to c ,use a
            hanoiTower(num - 1, b, a, c);

        }

    }


}