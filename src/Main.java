import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /*
        JFrame cpsFrame = new JFrame("Clicks per Second");
        cpsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CPS myCPS = new CPS();

        cpsFrame.add(myCPS);
        */



        System.out.println("The code has begun");
        JFrame jframe = new JFrame("Demo Frame");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myGUI = new GUI(600,400);
        jframe.add(myGUI);
        jframe.setSize(300,300);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

    }
}
