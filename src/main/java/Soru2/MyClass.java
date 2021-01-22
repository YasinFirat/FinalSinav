/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru2;

public class MyClass {
    public static int countInstance=0;
    public static int sinirBelirle=3;
    public MyClass(){
        countInstance++;
        if(countInstance<sinirBelirle){
            System.out.println(countInstance + ". Defa Çağrıldı");
        }else{
            System.out.println("En fazla " +sinirBelirle+" Defa Çağırabilirsiniz.");
        }
    }
    public static MyClass instance(){
        countInstance++;
        if(countInstance<sinirBelirle){
             System.out.println(countInstance + ". Defa Çağrıldı");
             return new MyClass();
        }else{
             System.out.println("En fazla " +sinirBelirle+" Defa Çağırabilirsiniz.");
            return null;
        }
    }
    public MyClass getIndex(){
        countInstance++;
        if(countInstance<sinirBelirle){
             System.out.println(countInstance + ". Defa Çağrıldı");
             return new MyClass();
        }else{
             System.out.println("En fazla " +sinirBelirle+" Defa Çağırabilirsiniz.");
            return null;
        }
    }
}
