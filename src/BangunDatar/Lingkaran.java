/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author taufik.amary@gmail.com
 */
public class Lingkaran {
    private double jari_jari,phi;
    
    private double getJari(){
        return jari_jari;
    }
    private double getPhi(){
        return phi = 3.14;
    }
    
    public void setPhi(){
        this.phi = 3.14;
    }
    public void setJari(double r){
        this.jari_jari = r;
    }
     public double luas(){
         getPhi();
         getJari();
         return this.phi*this.jari_jari*this.jari_jari;
     }
     
     public double keliling(){
         getPhi();
         getJari();
         return 2* this.phi*this.jari_jari; 
     }
     
}    

