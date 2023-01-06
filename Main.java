import javax.swing.*;

public class Main extends JFrame {

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


    private JMenuBar createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenuItem a = new JMenuItem("a");
        JMenuItem b = new JMenuItem("b");
        JMenuItem c = new JMenuItem("c");
        JMenuItem d = new JMenuItem("d");
        file.add(a);
        file.add(b);
        edit.add(c);
        edit.add(d);
        mb.add(file);
        mb.add(edit);
        return mb;
    }
}
