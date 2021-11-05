/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author -LENOVO-
 */
public abstract class Binatang {
    public String nama;
    public int jmlKaki;
    public Binatang(String nama, int jmlKaki){
        this.nama=nama;
        this.jmlKaki=jmlKaki;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public String getNama() {
        return nama;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }
    
    public abstract void displayBinatang();
}
