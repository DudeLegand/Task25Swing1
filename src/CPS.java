import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class CPS extends JPanel implements ActionListener{

    public CPS (){
        final long[] clicksPerSecond = {0};
        final long[] click = {0};
        final int[] highest = new int[1];
        highest[0] = 0;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a component to add to the frame; in this case a text area with sample text
        final TextArea textArea = new TextArea("Don't click the button");
        // Create a component to add to the frame; in this case a button
        JButton button = new JButton("Click Me!!");
        button.setPreferredSize(new Dimension(100, 100));
        // Add a mouse listener to determine click counts
        button.addActionListener(new ActionListener() {
            //Instant starts = Instant.now();
            ZonedDateTime now = ZonedDateTime.now();
            @Override
            public void actionPerformed(ActionEvent e) {
                //Instant ends = Instant.now();
                click[0]++;
                double seconds = (now.until(ZonedDateTime.now(), ChronoUnit.MILLIS));
                seconds = seconds/1000;
                now = ZonedDateTime.now();
                if (1/seconds > highest[0]){
                    highest[0] = (int) ((int) 1/seconds);
                }
                textArea.setText((String.valueOf(1/seconds)) + "   Highest: " + highest[0]);
                //Duration.between(starts, ends);
            }
        });
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        // Add the components to the frame; by default, the frame has a border layout
        frame.add(textArea, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);

        // Show the frame
        int width = 300;
        int height = 300;
        frame.setSize(width, height);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
