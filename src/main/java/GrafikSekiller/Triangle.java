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
public class Triangle extends Shape {
    public Triangle(Vector2[] _points){
        totalPoints=3;
        if(totalPoints==_points.length){
            points=Arrays.copyOf(_points, _points.length);
            System.out.println("Triangle oluşturuldu.");
        }
        else{
            System.out.println("point noktası eksik");
        }
    }
    public Triangle(){
        totalPoints=3;
        points=new Vector2[totalPoints];
        System.out.println("Triangle oluşturuldu.");
    }
    @Override
    void draw() {
        for (int i = 0; i < totalPoints; i++) {
            try{
                System.out.println("Triangle drawn" +points[i].getVector2() );
            }catch(Exception e){
                System.out.println(i+". point noktasına atama yapınız lütfen");
            }
        }
    }
     public Triangle indexOfPoint(int index){
        indexPoint=index;
        return this;
    }
    public Triangle Point(float x,float y){
        points[indexPoint]=new Vector2(x,y);
        return this;
    }
    public Triangle Point(int index,float x,float y){
        points[index]=new Vector2(x,y);
        return this;
    }
}
