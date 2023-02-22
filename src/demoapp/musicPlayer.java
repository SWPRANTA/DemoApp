package demoapp;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class musicPlayer {

    static musicPlayer player = new musicPlayer();
    static Clip clip;

    private musicPlayer() {

    }

    public static musicPlayer getInstance() {
        return player;
    }

    public static void loadMusic(String filepath) {
        try {
            File musicPath = new File(filepath);

            if (musicPath.exists()) {
                AudioInputStream ausioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                System.out.println("Initialized");
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

}
