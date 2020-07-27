package com.zadania_wzorce.b_structural.adapter_demo;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Odtwarzam Mp4 o nazwie: " + fileName);
    }
}
