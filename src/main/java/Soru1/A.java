/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru1;

import java.util.Arrays;

/**
 *
 * @author yasin
 */
public class A {
    /*Evet kontrolsüz bir şekilde değiştirilmesi mümkündür.
    Dizi olarak tanımlanmış private özellikli değişken 
    kontrolsüz şekilde değiştirilebilir.,
    Bunu kontrollü şekilde değiştirmenin yolu dizinin 
    kopyası alınarak return edilmesidir.
    */
    private int sayi=3;
    private final int[] sayilar={1,2,3};
    private String isim="yasin";
    
    public int[] getSayilar(){
        //Pek güvenli değil
        return sayilar;
    }
    public int[] getSayilarCopy(){
        //güvenli bir şekilde dizi return edildi
        return Arrays.copyOf(sayilar, sayilar.length);
    }
    public int getSayi(){
        return sayi;
    }
    
    public String getIsim(){
        return isim;
    }
}
