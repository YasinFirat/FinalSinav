/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru1;

/**
 *
 * @author yasin
 */
public class B {
    public static void main(String[] args) {
       A a=new A();
       int[] normalDizi=a.getSayilar();
       int[] copyDizi=a.getSayilarCopy();
       
        copyDizi[0]=9;
        System.out.print("Copy Dizi: ");
        for (int i = 0; i < a.getSayilarCopy().length; i++) {
            System.out.print(" "+a.getSayilarCopy()[i]);
        }
        
        normalDizi[0]=5; //şimdi normal diziyi değiştirelim
      
        System.out.print("\nNormal Dizi: ");
        for (int i = 0; i < a.getSayilar().length; i++) {
            System.out.print(" " +a.getSayilar()[i]);
        }
    }
}
