package com.yatsyna.springstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> music;

    @Autowired
    public MusicPlayer(List<Music> music) {

        this.music = music;
    }

    public String playMusic() {
        Random randomMusic = new Random();
        int ind = randomMusic.nextInt(music.size());
        return "Playing: " + music.get(ind).getSong();
    }
}
