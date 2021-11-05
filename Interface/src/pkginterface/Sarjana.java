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
public class Sarjana extends Mahasiswa implements ICumlaude{
    Sarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus(){
        System.out.println("Saya "+super.nama+" sudah menyelesaikan Skripsi");
    }
    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK saya lebih dari 3,51");
    }
    
}
