/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafikSekiller;

/**
 *
 * @author yasin
 */
public class Vector2{
     private float x;
     private float y;
     private Vector2(){}
     public Vector2(float x,float y){
         this.x=x;
         this.y=y;
     }
     public float getX(){
         return x;
     }
     public float getY(){
         return y;
     }
     public void setX(float x){
         this.x=x;
     }
     public void setY(float y){
         this.y=y;
     }
     public void setVector2(float x,float y){
         this.x=x;
         this.y=y;
     }
     public String getVector2(){
         return "X : "+ x+ " Y: "+y;
     }
}
