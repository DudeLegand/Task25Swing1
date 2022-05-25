import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.MemoryNotificationInfo;
import java.util.Objects;

public class GUI extends JPanel implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;

    public GUI(int width, int height){
        System.out.println("The GUI code has begun");
        this.setPreferredSize(new Dimension(width, height));

        button1 = new JButton("Calculator");
        button1.setBounds(130,200,200,40);
        button2 = new JButton("Stats");
        button2.setBounds(330,200,200,40);
        button3 = new JButton("Exit");
        button3.setBounds(530,200,200,40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        add(button1);
        add(button2);
        add(button3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(Objects.equals(e.getActionCommand(), "Calculator")){
            EventQueue.invokeLater(() -> {
                var ex = new Menu();
                ex.setVisible(true);

            });
        } else if(Objects.equals(e.getActionCommand(), "Stats")){
            System.out.println("Graph");
            Basic basic = new Basic(300,300);
        } else {
            System.exit(0);
        }
    }
}