/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehinhdichuyen;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Pham Khanh Ha Draw: - 1 window (JFrame) - 1 baground - 'Nen'
 * (JPanel): update by paint() method - 1 character - 'Hinh' (object) => The
 * window contains the baground, the baground contains the character.
 */
public class VeHinhdichuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jf = new JFrame();
        jf.setSize(500, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Nen nen = new Nen();
        jf.add(nen);
        jf.setVisible(true);//bat dau goi pain();
        try {
            nen.chay();
        } catch (InterruptedException ex) {
            Logger.getLogger(VeHinhdichuyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
