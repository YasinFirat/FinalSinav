/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafikSekiller;

public class DrawingManager {
    private Shape shape;
    
    public Shape getShape(){
        return shape;
    }
    public void DrawShape(Shape s){
        s.draw();
    }
}
