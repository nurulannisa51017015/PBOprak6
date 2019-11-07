/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applikasi4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.event.*;

public class Applikasi4 implements ActionListener  {

    /**
     * @param args the command line arguments
     */
    

    /**
     * @param args the command line arguments
     */
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout(null);
        
        JButton butt = new JButton ("click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20, 200, 20);
        
        Applikasi4 app = new Applikasi4();
        app.label = new JLabel("0 click");
        app.label.setBounds(20,40, 200,20);
        frame.getContentPane().add(app.label);
        
        butt.addActionListener(app);
        frame.setVisible(true);
        }

    
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                
            }
        });
    }
   int clickCount=0;
   JLabel label;

    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount++;
        label.setText("Clicks ="+clickCount);
    }
}

