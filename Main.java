import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JMenuItem b = new JMenuItem("b");
        b.addActionListener(this);
        JMenuItem c = new JMenuItem("c");
        c.addActionListener(this);
        JMenuItem d = new JMenuItem("d");
        d.addActionListener(this);

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
        
    }
}
