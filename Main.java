import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.Color;
import java.sql.*;

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
                mainPanel.setCircleColor(new Color(255, 192, 203));

                try {
                    Connection c = DriverManager.getConnection("jdbc:derby:cs490r");
                    Statement s = c.createStatement();
                    ResultSet rs = s.executeQuery("select count(*) from students");
                    rs.next();
                    int thisNum = rs.getInt(1);
                    System.out.println("There are " + thisNum + " rows in the table");
                } catch (SQLException ex) {
                    System.out.println("can't connect to the database");
                }
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
