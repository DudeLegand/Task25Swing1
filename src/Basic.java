import javax.swing.*;
import java.awt.*;

public class Basic extends JPanel {

    private JFrame frame;

    public Basic(int width, int height){
        frame = new JFrame("Basic Graph");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(width,height);
        frame.getContentPane().add(this);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        int left = 50;    // hard-coded just for testing
        int top = 80;
        int width = 40;
        int height = 150;
        g.setColor(Color.red);
        g.fillRect(left, top, width, height);

    }


}
