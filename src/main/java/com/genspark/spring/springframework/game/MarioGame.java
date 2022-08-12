package com.genspark.spring.springframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    private Enemies enemies;

    public MarioGame() {
        this.enemies = new Enemies(20, "Goomba");
    }


    @Override
    public void up(){
        System.out.println("jump");
    }
    @Override
    public void down(){
        System.out.println("crouch");
    }
    @Override
    public void left(){
        System.out.println("stop");
    }
    @Override
    public void right(){
        System.out.println("accelerate");
    }

    public void enemies(){
        System.out.println(enemies);
    }
}
