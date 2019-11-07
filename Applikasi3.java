/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applikasi3;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.event.*;
public class Applikasi3 implements ActionListener {

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
        
        Applikasi3 app = new Applikasi3();
        app.label = new JLabel("nama tidak terdeksi");
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
   JLabel label;

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("nama saya Nisa");
    }
}
