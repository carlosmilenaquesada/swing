package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//FRAME
//------------------------------------------------------------------------------

public class MyFrame extends JFrame implements ActionListener {

    /*MyFrame() {
        this.setTitle("JFrame title goes here"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent this from being resized
        this.setSize(420, 420); //set the x-dimension, and y-dimension of this
        this.setVisible(true); //make this visible

        ImageIcon image = new ImageIcon("src\\swing\\icono.png"); //create a ImageIcon
        this.setIconImage(image.getImage()); //change icon of this
        this.getContentPane().setBackground(new Color(123, 50, 250)); //change color of background
    }*/
    //BUTTON
    //----------------------------------------------------------------------
    /*JButton button;
    JLabel label;

    public MyFrame() {
        ImageIcon icon = new ImageIcon("src\\swing\\pointer.png");
        ImageIcon icon2 = new ImageIcon("src\\swing\\face.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
        
        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }
*/
    @Override
    public void actionPerformed(ActionEvent e) {
        /*if (e.getSource() == button) {
            //System.out.println("poo");
            //button.setEnabled(false);
            label.setVisible(true);
        }*/
    }
    


}
