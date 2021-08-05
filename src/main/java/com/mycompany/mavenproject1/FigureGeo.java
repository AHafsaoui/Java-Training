package com.mycompany.mavenproject1;


/**
 *
 * @author pc-asus
 */
public class FigureGeo {
   private int x;
   private int y;
   public void moveTo(int newX, int newY) {
       this.x = newX;
       this.y = newY; 
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
   
} 
 