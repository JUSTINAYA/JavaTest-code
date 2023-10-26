package com.justin.extend_.single;

public class SingleTon {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance.getName());
    }

}

class GirlFriend {
    private String name;

    private static GirlFriend gf = new GirlFriend("孟孟");

    private GirlFriend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }
}

