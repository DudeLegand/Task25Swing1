import javax.swing.*;
import java.awt.EventQueue;

public class Menu extends JFrame {

    JButton button1;
    JButton button2;
    JButton button3;


    public Menu() {
        initUI();
    }

    private void initUI() {
        createMenuBar();
        setTitle("Calculator");
        setSize(360, 250);
        setLocationRelativeTo(null);
    }

    private void createMenuBar() {

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

        setJMenuBar(menuBar);
    }
}