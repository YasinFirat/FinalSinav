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
public class Ders {
    //Not ders'e ait olduğundan dolayı not sınıfı oluşturmak mantıksız kaçacağından dolayı
    // not sınıfını yazmak yerine float olarak bir değer atamak yeterli olacak düşünüyorum(bu mimariye göre)  
    //çünkü ders'e ait bir değişken ve dersi de dizi olarak çağırıdığımızdan dolayı ileride notları sırala,
    //notları göster gibi istekler oluştuğunda getDersNot'a ulaşıp gereken işlemleri yapabiliriz.
    //her ihtimale karşı Not sınıfını oluşturdum fakat main'de herhangi bir çağrımda bulunmadım. 
    private String dersAdi;
    private float dersNot;
    private Not not;
    private Ders(){} // bu şekilde çağrılmasına engel oldum.
    public Ders(String _dersAdi,float _dersNot){
        dersAdi=_dersAdi;
        dersNot=_dersNot;
        not=new Not();
    }
    public String getDersAdi(){
        return dersAdi;
    }
    public float getDersNot(){
        return dersNot;
    }
    public Not getNotClass(){
        return not;
    }
    public void setDersAdi(String _dersAdi){
        dersAdi=_dersAdi; 
    }
    public void setDersNot(float _dersNot){
         not.setNot(_dersNot);
         dersNot=_dersNot;
    }
}
