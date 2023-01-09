import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Main extends JFrame implements ActionListener{

    private Vis mainPanel;

    public Main() {

        JMenuBar jmb = createMenu();
        setJMenuBar(jmb);

        //TODO add a menu bar and (time permitting) a toolbar

        mainPanel = new Vis();

        setContentPane(mainPanel);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CS 490R");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    /**
     * method to create a menu bar
     * @return the menu bar
     */
    private JMenuBar createMenu() {
        //observer design pattern

        //create menu
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        //create submenus
        JMenuItem a = new JMenuItem("a");
        a.addActionListener(this);
        a.setActionCommand("a");

        JMenuItem b = new JMenuItem("b");
        b.addActionListener(this);
        b.setActionCommand("b");

        JMenuItem c = new JMenuItem("c");
        c.addActionListener(this);
        c.setActionCommand("c");

        JMenuItem d = new JMenuItem("d");
        d.addActionListener(this);
        d.setActionCommand("d");

        //tie everything together
        file.add(a);
        file.add(b);
        edit.add(c);
        edit.add(d);
        mb.add(file);
        mb.add(edit);
        return mb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        System.out.println("a menu was clicked");
        String cmd = e.getActionCommand();

        switch (cmd) {
            case "a":
                mainPanel.setCircleColor(Color.RED);
                break;
            case "b":
                mainPanel.setCircleColor(Color.GREEN);
                break;
            case "c":
                mainPanel.setCircleColor(Color.MAGENTA);
                break;
            case "d":
                mainPanel.setCircleColor(Color.BLACK);
                break;
        }
        
    }
}
