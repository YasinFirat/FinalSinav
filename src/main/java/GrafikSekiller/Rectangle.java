/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafikSekiller;

import java.util.Arrays;

/**
 *
 * @author yasin
 */
public class Rectangle extends Shape {
    public Rectangle(Vector2[] _points){
        totalPoints=4;
        if(totalPoints==_points.length){
            points=Arrays.copyOf(_points, _points.length);
            System.out.println("Triangle oluşturuldu.");
        }
        else{
            System.out.println("point noktası eksik");
        }
    }
    public Rectangle(){
        totalPoints=4;
        points=new Vector2[totalPoints];
        System.out.println("Triangle oluşturuldu.");
    }
    @Override
    public void draw(){
       
        for (int i = 0; i < totalPoints; i++) {
            try{
                System.out.println("Rectangle drawn" +points[i].getVector2() );
            }catch(Exception e){
                System.out.println(i+". point noktasına atama yapınız lütfen");
            }
        }
    }
    public Rectangle indexOfPoint(int index){
        indexPoint=index;
        return this;
    }
    public Rectangle Point(float x,float y){
        points[indexPoint]=new Vector2(x,y);
        return this;
    }
    public Rectangle Point(int index,float x,float y){
        points[index]=new Vector2(x,y);
        return this;
    }
}
