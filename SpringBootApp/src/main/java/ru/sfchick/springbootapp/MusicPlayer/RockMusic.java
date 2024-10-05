package ru.sfchick.springbootapp.MusicPlayer;

import org.springframework.stereotype.Component;

@Component("musicRockBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "I Hate Everything About You";
    }
}
