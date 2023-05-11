package FirstGame;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import java.io.File;

public class Game {
    public Game() {
    }
    public static void main() {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("backgroundMusic.wav")));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        JFrame window = new JFrame("Shooting Game");
        window.setDefaultCloseOperation(3);
        
        window.pack();
        window.setContentPane(new GamePanel());
        window.setResizable(false);
        window.setVisible(true);
        window.pack();
    }
}
