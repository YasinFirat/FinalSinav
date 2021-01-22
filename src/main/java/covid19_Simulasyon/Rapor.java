/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_Simulasyon;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author yasin
 */
public class Rapor extends javax.swing.JPanel {
    public int population=100;
    public int counter;
    private Color color;
    
    public void setColor(Color c){
        color=c;
    }
    public Rapor setTotalStatusOfSimulasyon(int count){
        this.counter=count;
        return this;
    }
    
     @Override
    public void paint(Graphics g){
         
        g.setColor(Color.GRAY);
        g.fillRect(0, 0,this.getWidth(), this.getHeight());
       
        g.setColor(color);
        g.fillRect(0,this.getHeight()-(this.getHeight()*counter/population),this.getWidth(),(this.getHeight()*counter/population));
       
        super.paintComponents(g);
         this.repaint();
       
    }
    
}
