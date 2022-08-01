package com.genspark.spring.springframework.game;

public class Pacman implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Pacman Go up");
    }

    @Override
    public void down() {
        System.out.println("Pacman Go down");
    }

    @Override
    public void left() {
        System.out.println("Pacman go left");
    }

    @Override
    public void right() {
        System.out.println("Pacman go right");
    }
}
