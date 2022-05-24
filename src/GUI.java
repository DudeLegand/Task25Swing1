import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener {

    JButton button1;
    JButton button2;

    public GUI(int width, int height){
        System.out.println("The GUI code has begun");
        this.setPreferredSize(new Dimension(width, height));

        button1 = new JButton("Ur mum");
        button1.setBounds(130,200,200,40);
        button2 = new JButton("Graph");
        button2.setBounds(330,200,200,40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        add(button1);
        add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Ur mum"){
            System.out.println("Ur mum");
            Meme meme = new Meme(300,300);
        } else {
            System.out.println("Graph");
            Basic basic = new Basic(300,300);
        }
    }
}