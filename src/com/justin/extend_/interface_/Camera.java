package com.justin.extend_.interface_;

public class Camera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("Camera run");
    }

    @Override
    public void stop() {
        System.out.println("Camera stop");
    }
}
