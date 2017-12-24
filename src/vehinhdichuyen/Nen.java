/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehinhdichuyen;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Pham Khanh Ha
 */
public class Nen extends JPanel {

    private Hinh hinh = new Hinh();

    public Nen() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.

        this.hinh.ve(grphcs);
        try {
            Thread.sleep(100);//nghỉ 100/1000 giây rồi vẽ lại 1 lần
        } catch (InterruptedException ex) {
            Logger.getLogger(Nen.class.getName()).log(Level.SEVERE, null, ex);
        }

        repaint();
    }
/**
 * Để tọa độ của Hình được di chuyển
 * @throws InterruptedException 
 */
    public void chay() throws InterruptedException {
        int d = 10;//quang duong
        while (true) {
            this.hinh.dichuyen(d, 0);
            if (this.hinh.getX() > this.getWidth()) {
                this.hinh.setX(0);
            }
            Thread.sleep(70);
        }
    }

}
