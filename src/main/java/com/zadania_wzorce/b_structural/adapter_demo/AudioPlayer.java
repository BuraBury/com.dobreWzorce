package com.zadania_wzorce.b_structural.adapter_demo;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("Odtwarzam mp3 o nazwie: " + fileName);
        } else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, fileName);
        } else {
            System.out.println("Zły format pliku " + type + " nie jest obsługiwany!");
        }

    }
}
