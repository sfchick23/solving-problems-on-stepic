package ru.sfchick.springOverride;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    //    @Autowired()
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }

    public String playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
        return "Playing: " + rockMusic.getSong();
    }
}
