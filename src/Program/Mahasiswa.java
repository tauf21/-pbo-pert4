/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author taufik.amary@gmail.com
 */
public class Mahasiswa {
    private String nim,nama,kelas;
    
    public void setNama(String n){
        this.nama = n;
    }
    public void setKelas(String kls){
        this.kelas = kls;
    }
    public void setNim(String nm){
        this.nim= nm;
    }
    
    public String getNama(){
        return nama;
    }
    public String getKelas(){
        return kelas;
    }
    public String getNIM(){
        return nim; 
    }
}

