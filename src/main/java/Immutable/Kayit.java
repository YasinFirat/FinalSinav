/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Immutable;

/**
 *
 * @author yasin
 */
public class Kayit {
    public static void main(String[] args) {
       Kimlik kimlik=new Kimlik();
       
       kimlik.setAd("Yasin");
       kimlik.setSoyad("Firat");
       kimlik.setOgrenciNo(150304016);
       
       Ders[] ders=new Ders[3];
       ders[0]=new Ders("Kimya",62);
       ders[1]=new Ders("Biyoloji",15);
       ders[2]=new Ders("Matematik",99.99f);
       
       Ogrenci ogrenci=new Ogrenci(kimlik,ders);
       System.out.println(ogrenci.getKimlik().getAd()+ogrenci.getDers()[0].getDersAdi()+ogrenci.getDers()[0].getDersNot() );
       ders[0].setDersNot(19);
       System.out.println(ogrenci.getKimlik().getAd()+ogrenci.getDers()[0].getDersAdi()+ogrenci.getDers()[0].getDersNot() );
       
    }
}
