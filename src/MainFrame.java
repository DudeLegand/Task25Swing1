import javax.swing.*;
import java.awt.*;

//Main Frame the creates all the panels and hides the one you don't need

// TODO: 26/05/2022 Add all panels

public class MainFrame extends JFrame{
    JPanel[] allPanels;

    public MainFrame(){
        allPanels = new JPanel[3];
        allPanels[0] = new MainMenuGUI();
        allPanels[1] = new CalculatorGUI();
        allPanels[2] = new StatsGUI();
        for (JPanel panel :
                allPanels) {
            this.add(panel);
            panel.setVisible(false);
        }
        allPanels[0].setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
    }

    public void navigate(int panelToHide, int panelToShow){
        allPanels[panelToHide].setVisible(false);
        allPanels[panelToShow].setVisible(true);
    }


}
