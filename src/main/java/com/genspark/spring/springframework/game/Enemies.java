package com.genspark.spring.springframework.game;


public class Enemies {

    private int size;
    private String name;

    public Enemies(int size, String name) {
        this.size = size;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Enemies{" +
                "size=" + size +
                ", name=" + name +
                '}';
    }
}
