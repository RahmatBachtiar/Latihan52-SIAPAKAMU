/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan52.SIAPAKAMU;

/**
 *
 * @author 
 * NAMA     : Rahmat Bachtiar
 * KELAS    : FS112B-PBO
 * NIK      : 2022431598
 * Deskripsi Program	: Program ini berisi program untuk
 * menampilkan profile dosen dan mahasiswa
 */
public class Mahasiswa extends Manusia {
    private String nim;
    private String kelas;
    
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar "
                + "di kelas PBO2");
    }
    
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
    
}
