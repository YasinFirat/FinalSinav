/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru2;

/**
 *
 * @author yasin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyClass m=new MyClass();
       m.getIndex().getIndex();
       MyClass.instance().getIndex().getIndex().getIndex();
    }
    
}
