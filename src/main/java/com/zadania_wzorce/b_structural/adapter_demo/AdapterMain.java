package com.zadania_wzorce.b_structural.adapter_demo;

public class AdapterMain {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Queen - We are the champions.mp3");
        audioPlayer.play("vlc", "Deadpool 2.vlc");
        audioPlayer.play("mp4", "frozen.mp4");
        audioPlayer.play("avi", "Wesele Pauliny.avi");

    }
}
