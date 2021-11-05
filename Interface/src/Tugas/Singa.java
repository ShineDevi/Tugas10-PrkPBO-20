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
public class Singa extends Binatang implements IKarnivora{
    private String suara, warnaBulu;
    Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    @Override
    public void displayBinatang(){
        System.out.println("Nama binatang: "+super.getNama());
        System.out.println("Jumlah kaki: "+super.getJmlKaki());
        System.out.println("Suara: "+this.suara);
        System.out.println("Warna bulu: "+this.warnaBulu);
    }
    @Override
    public void displayMakan(){
        System.out.println("Singa makan daging, nyam...");
    }
    public void displayData(){
        displayBinatang();
        displayMakan();
    }
}
