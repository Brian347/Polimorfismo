
package javaalgoritms;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author BRIAN
 */
public class JavaALgoritms {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setTitle("Un primer frame");
        JLabel label = new JLabel("Hello, World");
        //label.setSize(30);
        label.setSize(10, 20);
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
    
}

