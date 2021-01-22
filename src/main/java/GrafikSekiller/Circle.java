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
public class Circle extends Shape implements AddRadius{
    private float radius;
    Circle(float _radius,float x,float y){
        totalPoints=1;
        radius=_radius;
        indexPoint=0;
        points=new Vector2[totalPoints];
        points[0]=new Vector2(5,3);
        System.out.println("Koordinat sisteminde "+points[0].getVector2()+" alana, "+ _radius+
                " yarıçaplı çember oluşturuldu");
    }
    Circle(float _radius){
        totalPoints=1;
        points=new Vector2[totalPoints];
        radius=_radius;
        indexPoint=0;
    }
     @Override
    public void draw(){
         System.out.println("Point "+ points[0].getVector2() + " Radius : " +getRadius()+ " Çember çizildi");
    }
    @Override
    public float getRadius() {
        return radius;
    }
    @Override
    public void setRadius(float _radius) {
        radius=_radius;
    }
    public Circle Point(float x,float y){
        points[0]=new Vector2(x,y);
        return this;
    }
}
