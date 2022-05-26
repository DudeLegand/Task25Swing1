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
        JMenuBar menuBar = new JMenuBar();

        ImageIcon iconHelp = new ImageIcon("N:\\Computers\\Yr 12\\Images\\help.png");
        ImageIcon iconCopy = new ImageIcon("N:\\Computers\\Yr 12\\Images\\copy.png");
        ImageIcon iconSave = new ImageIcon("N:\\Computers\\Yr 12\\Images\\sav.png");
        ImageIcon iconExit = new ImageIcon("N:\\Computers\\Yr 12\\Images\\exit.png");


        JMenu fileMenu = new JMenu("More");
        JMenu impMenu = new JMenu("Navigate");

        JMenuItem navigateToMainMenu = new JMenuItem("Main Menu");
        JMenuItem navigateToStats = new JMenuItem("Stats");

        impMenu.add(navigateToMainMenu);
        impMenu.add(navigateToStats);

        JMenuItem helpMenuItem = new JMenuItem("Help", iconHelp);
        helpMenuItem.setToolTipText("Get help from online");

        JMenuItem copyMenuItem = new JMenuItem("Copy", iconCopy);
        copyMenuItem.setToolTipText("Copy current results");

        JMenuItem saveMenuItem = new JMenuItem("Save", iconSave);
        saveMenuItem.setToolTipText("Save the data");

        JMenuItem exitMenuItem = new JMenuItem("Exit", iconExit);
        exitMenuItem.setToolTipText("Exit application");

        exitMenuItem.setBounds(0,0,10,10);

        exitMenuItem.addActionListener((event) -> System.exit(0));

        fileMenu.add(helpMenuItem);
        fileMenu.add(copyMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(impMenu);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);


        add(menuBar);


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