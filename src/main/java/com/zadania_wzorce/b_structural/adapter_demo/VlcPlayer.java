package com.zadania_wzorce.b_structural.adapter_demo;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Odtwarzam VLC o nazwie " + fileName);
    }
}
