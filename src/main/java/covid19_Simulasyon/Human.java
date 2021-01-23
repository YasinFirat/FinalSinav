/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_Simulasyon;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yasin
 */
public class Human {
    private int target_x;
          private int target_y;
          private Covid19 statusPatient;
          private Color color;
          int px;
          int py;
          final int r=10;
          public int timer=0;
          private Human(){}
          Human(int px,int py,int target_x,int target_y,Covid19 _statusPatients,Color _start_status_patient){
              this.px=px;
              this.py=py;
              this.target_x=target_x;
              this.target_y=target_y;
              statusPatient=_statusPatients;
              color=_start_status_patient;
          }
          void setTarget(int target_x, int target_y){
              this.target_x=target_x;
              this.target_y=target_y;
          }
          boolean isTargetArrive(int distance){
              if(Math.sqrt(Math.pow((px-target_x), 2)+Math.pow((py-target_y), 2))<distance){
                  return true;
              }else{
                  return false;
              }
          }
          void goTarget(int speed){
              px=(px-target_x)<0?px+speed:px-speed;
              py=(py-target_y)<0?py+speed:py-speed;
          }
          Color getStatusPatient(){
              return color;
          }
          Color setStatusPatient(){
              color=statusPatient.getPatient();
              return color;
          }
          Color setStatusHealtyt(){
              color=statusPatient.getHealthy();
              return color;
          }
          Color setStatusRecovered(){
              color=statusPatient.getRecovered();
              return color;
          }
          void isPatient(int time_of_treatment,int speed_simulation,Scene s){//iyileşme süreci eğer hastaysa gün olarak artar.
              
              if(color==statusPatient.getPatient()){
                  timer+=speed_simulation;
                  if(timer>time_of_treatment){
                      color=setStatusRecovered();
                      s.counter_recovered++;
                      s.counter_patients--;
                  }
              }
              
          }
          
    }

