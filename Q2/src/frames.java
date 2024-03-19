import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import  javax.swing.*;

public class frames extends JFrame{
    protected JTabbedPane tabPane;
    boolean unsavedChanges = false;
    JButton quitButton;
    public frames(){
        super("FramesDemo");
        Container cp = getContentPane();
        cp.add(quitButton = new JButton("Exit"));
       cp.setLayout(new FlowLayout());

        cp.add(new JLabel("Wonderful"));
      cp.add(new JButton("Yes"));
       pack();

//        tabPane = new JTabbedPane();
//        tabPane.add(new JLabel("One", JLabel.CENTER), "First");
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                System.exit(0);

            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                setVisible(false);
                dispose();
                System.exit(0);
            }
        });
        pack();

    }

    public static void main(String[] args) {
        new frames().setVisible(true);
    }

}
