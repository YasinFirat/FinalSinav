/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Immutable;

import java.util.Arrays;

/**
 *
 * @author yasin
 */
public final class Ogrenci {
    //Not ders'e ait olduğundan dolayı buraya not sınıfını eklemedim.
    private final Kimlik kimlik;
    private final Ders[] ders;
    
    public Ogrenci(Kimlik _kimlik,Ders[] _ders){
        this.kimlik=_kimlik;
        this.ders=_ders;
    }
    public Ders[] getDers(){
        return Arrays.copyOf(ders,ders.length);
    }
    public Kimlik getKimlik(){
        return kimlik;
    }
}
