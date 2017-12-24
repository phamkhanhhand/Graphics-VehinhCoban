/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehinhdichuyen;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Pham Khanh Ha
 */
public class Hinh {

    int x, y;//x, y là tọa độ elip
    int with, height;

    public Hinh() {
        x = 0;
        y = 120;
        with = 10;
        height = 15;
    }

    public void ve(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(x, y, 10, 20);
    }
}
