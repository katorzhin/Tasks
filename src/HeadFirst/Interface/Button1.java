package HeadFirst.Interface;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
                gui.go();
    }
    public void go (){
        JFrame frame = new JFrame();
        JButton button1 = new JButton("east");
        JButton button2 = new JButton("west");
        JButton button3 = new JButton("north");
        JButton button4 = new JButton("south");
        JButton button5 = new JButton("Center");





        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST,button1);
        frame.getContentPane().add(BorderLayout.WEST,button2);
        frame.getContentPane().add(BorderLayout.NORTH,button3);
        frame.getContentPane().add(BorderLayout.SOUTH,button4);
        frame.getContentPane().add(BorderLayout.CENTER,button5);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
}