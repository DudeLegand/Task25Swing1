import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenReaderGUI extends JPanel implements ActionListener {

    JButton back;

    public ScreenReaderGUI(){

        back = new JButton("Back");
        back.setBounds(125,500,300,100);
        back.addActionListener(this);


        this.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "Back":
                MainFrame.navigate(1,0);
                break;

        }

    }
}
