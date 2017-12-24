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

    private int x, y;//tọa độ của Hình
    private int with, height;//kích thước hình

    public Hinh() {
        x = 0;
        y = 120;
        with = 10;
        height = 15;
    }

    /**
     * Vẽ hình
     *
     * @param g : đối tượng Graphics từ Nền truyền vào để vẽ hình này trên nền
     * đó.
     */
    public void ve(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(x, y, 10, 20);
    }

    /**
     * Di chuyển hình
     *
     * @param dx Quãng đường di chuyển theo chiều ngang
     * @param dy Quãng đường di chuyển theo chiều dọc
     */
    public void dichuyen(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
