/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan52.siapakamu;

/**
 *
 * @author user
 */
public class Mahasiswa extends Manusia{
    private String nim,kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void kelasApa (){
        System.out.println("Saya nindi umur 17 tahun sedang belajar di kelas PBO2");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya mahasiswa"); //To change body of generated methods, choose Tools | Templates.
    }

    public Mahasiswa(String nim) {
        this.nim = nim;
    }
    
}
