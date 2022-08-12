package com.hillel.din.homeworks.homework13;

public class Main {
    public static void main(String[] args) {
        MusicStyles popMusic = new PopMusic();
        MusicStyles rockMusic = new RockMusic();
        MusicStyles classicMusic = new ClassicMusic();

        MusicStyles[] style = new MusicStyles[] {
              new PopMusic(), new RockMusic(), new ClassicMusic()
        };
        for (MusicStyles musicStyles : style) {
            musicStyles.playMusic();
        }
    }
}
