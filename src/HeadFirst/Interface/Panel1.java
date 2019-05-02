package HeadFirst.Interface;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("click me");
        JButton buttonTwo = new JButton("bliss");
        JButton button3 = new JButton("Huh?");

        panel.add(button);
        panel.add(buttonTwo);
        panel.add(button3);

        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }
}
