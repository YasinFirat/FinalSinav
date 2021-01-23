/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_Simulasyon;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Scene extends javax.swing.JPanel {
    
    ArrayList<Human> human=new ArrayList<Human>();
    public Covid19 statusPatient;
    public int population=0;
    public int starting_total_of_patients=0;
    public int counter_patients;
    public int counter_healthy;
    public int counter_recovered;
    

    public Scene() {
        this.statusPatient = new Covid19(Color.red,Color.cyan,Color.green);
        
    }
    @Override
    public void paint(Graphics g){
      
       addHuman();
        g.setColor(Color.black);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        drawObjects(g);
        super.paintComponents(g);
         this.repaint();
       
    }
    
    public void addHuman(){
         
        for (int i = 0;human.size()<population; i++) {
            int px,py,tx,ty;
            px=(int)(Math.random()*(this.getWidth()));
            py=(int)(Math.random()*(this.getHeight()));
            tx=(int)(Math.random()*(this.getWidth()));
            ty=(int)(Math.random()*(this.getHeight()));
            if(i<starting_total_of_patients){
                 human.add(new Human(px,py,tx,ty,statusPatient,statusPatient.getPatient()));
                 counter_patients++;
            }else{
                 human.add(new Human(px,py,tx,ty,statusPatient,statusPatient.getHealthy()));
                 counter_healthy++;
            }
        }
    }
    public void treatmentControl(int time_of_treatment,int speed_simulation){
        for (Human hum : human) {
            hum.isPatient(time_of_treatment,speed_simulation,Scene.this);
        }
    }
    
    public void covidStatus(int bulasma_katsayisi){
       
        //eğer obje kırmızı ise listedeki tüm objeleri tarasın
        //sosyal mesafeye uymayanlara katsayıya göre bulaştır.
        int pos_x=0,pos_y=0;
        for (int i = 0; i < human.size(); i++) {
            if(human.get(i).getStatusPatient()!=statusPatient.getPatient()){ //bulaştırma katsayısını buraya ekle
                    continue;//kırmızı değilse bir sonraki obje'ye geçsin
                }
            for (int j = i; j < human.size(); j++) {
                 if(human.get(j).getStatusPatient()==statusPatient.getHealthy()){ //iyileşmişse
                     pos_x=(int) Math.pow((human.get(i).px-human.get(j).px), 2);
                     pos_y=(int) Math.pow((human.get(i).py-human.get(j).py), 2);
                     if(Math.sqrt(pos_x+pos_y)<10&&(10*bulasma_katsayisi>=Math.random()*100)){
                         human.get(j).setStatusPatient();
                         counter_patients++;
                         counter_healthy--;
                        
                     }
                }
                
            }
        }
    }
    public void Move(int speed){
       
        int point=(int)(Math.random()*this.getWidth()/4);
        for(Human hum:human){
         
            if(hum.isTargetArrive(10)){
            int tx=(int)(Math.random()*(this.getWidth()-point));
            int ty=(int)(Math.random()*(this.getHeight()-point));
                hum.setTarget(tx, ty);
            }
            else{
                hum.goTarget(speed);
            }
        }
    }
    public void randomTarget(){
        for(Human hum:human){
           
            int point=(int)(Math.random()*this.getWidth()/4);
            int tx=(int)(Math.random()*(this.getWidth()-point));
            int ty=(int)(Math.random()*(this.getHeight()-point));
                hum.setTarget(tx, ty);
        }
    }
    public void drawObjects(Graphics g){
       
        for(Human hum:human){
             g.setColor(hum.getStatusPatient());
            g.fillOval(hum.px, hum.py, hum.r, hum.r);
        }
        
       
    }
   
}
