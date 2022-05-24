import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.*;

public class Meme extends JPanel {

    private JFrame frame;

    public Meme(int width, int height){
        frame = new JFrame("Meme");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(width,height);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        audio();
    }

    public static void audio() {
        try {
            File file = new File("N:\\Computers\\Yr 12\\rickroll.mp4");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }




}
