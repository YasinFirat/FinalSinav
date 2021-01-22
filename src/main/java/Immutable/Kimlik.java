/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Immutable;


public class Kimlik {
    //mutable class
    private String ad;
    private String soyad;
    private int ogrenciNo;
    
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public int getOgrenciNo(){
        return ogrenciNo;
    }
    public void setAd(String _ad){
        ad=_ad;
    }
    public void setSoyad(String _soyad){
        soyad=_soyad;
    }
    public void setOgrenciNo(int _ogrenciNo){
        ogrenciNo=_ogrenciNo;
    }
}
