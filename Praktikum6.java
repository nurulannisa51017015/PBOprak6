/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author User
 */
import javax.swing.*;
public class Praktikum6 {

    
    public static void main(String[] args) {
    JFrame f = new JFrame("title");
    JPanel  p = new JPanel();
    JButton b = new JButton("press me");
    
    p.add(b);
    f.setContentPane(p);
    
    f.show();
    
    }
    
}
