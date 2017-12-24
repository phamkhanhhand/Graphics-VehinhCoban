/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehinhdichuyen;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Pham Khanh Ha
 */
public class Nen extends JPanel{

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        Hinh hinh=new Hinh();
        hinh.ve(grphcs);
        repaint();
    }
    
}
