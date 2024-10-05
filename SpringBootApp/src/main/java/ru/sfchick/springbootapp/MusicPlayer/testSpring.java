package ru.sfchick.springbootapp.MusicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicClassicalBean");
        //System.out.println(music.getSong());

    //        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    //        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    //
    //        firstMusicPlayer.playMusic();
    //
    //        boolean compare = firstMusicPlayer == secondMusicPlayer;
    //        System.out.println(compare);
    //        System.out.println(firstMusicPlayer.getName());
    //        System.out.println(firstMusicPlayer.getVolume());

        context.close();
    }
}
