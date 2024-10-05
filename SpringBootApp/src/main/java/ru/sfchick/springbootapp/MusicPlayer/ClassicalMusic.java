package ru.sfchick.springbootapp.MusicPlayer;

import org.springframework.stereotype.Component;

@Component("musicClassicalBean")
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}


    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Bah";
    }

    private void doMyinit() {
        System.out.println("doMyinit");
    }

    private void doMyDestroy() {
        System.out.println("doMyDestroy");
    }


}
