/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clone;

/**
 *
 * @author yasin
 */
public class GameArea {

    public static int x=0;
    static{
        System.out.println("Buradayım");
        x=1;
    }
    public GameArea(){
        System.out.println("Nbr Len" + x);
        x=x++;
         System.out.println("Nbr Len2" + x);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameArea obj1=new GameArea();
         GameArea obj2=new GameArea();
         System.out.println("x1 = " + obj1.x);
         System.out.println("x2 = " + obj2.x);
    }
    
}
