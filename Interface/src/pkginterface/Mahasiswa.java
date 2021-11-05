/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author -LENOVO-
 */
public class Mahasiswa {
    protected String nama;
    Mahasiswa(String nama){
        this.nama=nama;
    }
    public void kuliahDiKampus(){
        System.out.println("Nama saya: "+this.nama);
        System.out.println("Saya berkuliah di Polinema");
    }
}
