/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafikSekiller;

public abstract class Shape {
    //her obje'nin koordinat sisteminde mutlaka bir konumu(point) vardır.
    int totalPoints;
    Vector2[] points;
    int indexPoint;
    abstract void draw();
}
