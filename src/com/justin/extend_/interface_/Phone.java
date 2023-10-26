package com.justin.extend_.interface_;

public class Phone implements UsbInterface {
    @Override
    public void start() {
        System.out.println("phone run");

    }

    @Override
    public void stop() {
        System.out.println("phone stop");

    }
}
