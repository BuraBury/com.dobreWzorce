package com.zadania_wzorce.b_structural.adapter_demo;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;


    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String type, String fileName) {
        advancedMediaPlayer.play(fileName);
    }
}
