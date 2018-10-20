/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import BangunDatar.Lingkaran;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Utama extends Lingkaran {  
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String nama,nim,kelas;
        double r;
        
        Mahasiswa Utama1 = new Mahasiswa();
        Lingkaran Utama2 = new Lingkaran();
        System.out.println("==========Input Data==========");
        System.out.print("Mauskkan Nama \t= ");
        nama = x.nextLine();
        System.out.print("Masukkan Kelas \t= ");
        kelas = x.nextLine();
        System.out.print("Masukkan NIM \t= ");
        nim = x.nextLine();
        
        System.out.println("==========Lingkaran===========");
        System.out.print("jari-jari \t= ");
        r = x.nextDouble();
        
        Utama1.setNama(nama);
        Utama1.setNim(nim);
        Utama1.setKelas(kelas);
        System.out.println("============Hasil=============");
        System.out.println("Nama  \t= "+Utama1.getNama());
        System.out.println("Kelas \t= "+Utama1.getNIM());
        System.out.println("Kelas \t= "+Utama1.getKelas());
        
       

        Utama2.setJari(r);
        System.out.println("Luas Lingkaran \t= "+Utama2.luas());
        System.out.println("Keliling Lingkaran \t= "+Utama2.keliling());
    }
    
    }
    

