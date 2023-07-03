package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Swing {

    public static void main(String[] args) {
        //LABEL
        //----------------------------------------------------------------------
        /*ImageIcon image = new ImageIcon("src\\swing\\dude.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        
        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER or RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP, CENTER or BOTTOM of ImageIcon
        label.setForeground(new Color(0x00FF00)); //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); //set font of text
        label.setIconTextGap(0); //set gap (distance between) of text to imagen
        label.setBackground(Color.black); //set backgroun color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100,100,250,250); //set x,y position within frame as well as dimensions
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        
        frame.pack(); //autosize frame to content. Must be calls after all content incorporation.*/

        //PANNEL
        //----------------------------------------------------------------------
        /*ImageIcon icon = new ImageIcon("src\\swing\\thumbup.png");
        
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,75,75);
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);        
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);*/

    }

}
