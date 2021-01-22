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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrawingManager drawing=new DrawingManager();
       
        Circle circle=new Circle(1,5,5);
        drawing.DrawShape(circle);
        circle.Point(3,9);
        drawing.DrawShape(circle);
        Rectangle rec=new Rectangle();
        rec.indexOfPoint(1).Point(5, 3).indexOfPoint(0).Point(1, 0).Point(3, 3, 0);
        drawing.DrawShape(rec);
        Triangle tri=new Triangle();
        tri.Point(0, 0, 0).Point(1, 4, 0).Point(2, 0, 3);
        drawing.DrawShape(tri);
    }
    
}
