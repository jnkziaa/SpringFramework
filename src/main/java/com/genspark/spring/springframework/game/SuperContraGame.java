package com.genspark.spring.springframework.game;

import org.springframework.stereotype.Component;

public class SuperContraGame implements GamingConsole {
    public SuperContraGame() {
    }

    @Override
    public void up(){
        System.out.println("SuperContraGame jump");
    }
    @Override
    public void down(){
        System.out.println("SuperContraGame crouch");
    }
    @Override
    public void left(){
        System.out.println("SuperContraGame stop");
    }
    @Override
    public void right(){
        System.out.println("SuperContraGame accelerate");
    }
}
