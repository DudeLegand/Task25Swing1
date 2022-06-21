import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class ScreenReaderGUI extends JPanel implements ActionListener {

    JLabel screenReaderTitle;
    JButton back;
    JToggleButton turnSROnOrOff;

    public ScreenReaderGUI(){

        screenReaderTitle = new JLabel("Screen Reader");
        screenReaderTitle.setFont(new Font("Consolas", Font.PLAIN,50));
        screenReaderTitle.setBounds(475,150,500,100);
        //mainMenuTitle.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        setLayout(null);

        back = new JButton("Back");
        back.setBounds(125,500,300,100);
        back.addActionListener(this);

        turnSROnOrOff = new JToggleButton("Turn On");
        turnSROnOrOff.setBounds(525,500,300,100);
        turnSROnOrOff.addActionListener(this);

        this.setBounds(0,0,1500,1500);


        this.add(screenReaderTitle);
        this.add(back);
        this.add(turnSROnOrOff);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "Back":
                MainFrame.navigate(1,0);
                break;

            case "Turn On":
            case "Turn Off":
                if(turnSROnOrOff.isSelected())
                    turnSROnOrOff.setText("Turn Off");
                else
                    turnSROnOrOff.setText("Turn On");
                break;

        }

    }
}
