/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan52.SIAPAKAMU;

/**
 *
 * @author Rahmat Bachtiar
 */
public class SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Dosen dosen1;
    Mahasiswa mahasiswa1;
    
    dosen1 = new Dosen();
    dosen1.setNip("41227829930");
    System.out.println("NIP DOSEN : "+dosen1.getNip());
    dosen1.siapaKamu();
    dosen1.mengajarApa();
    System.out.println(" ");
    
    mahasiswa1 = new Mahasiswa();
    mahasiswa1.setNim("10110269");
    System.out.println("NIM MAHASISWA  : "+mahasiswa1.getNim());
    mahasiswa1.siapaKamu();
    mahasiswa1.kelasApa();
    
    }
    
}
