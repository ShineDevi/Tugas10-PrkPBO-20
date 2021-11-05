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
public class PascaSarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
    public PascaSarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus(){
        System.out.println("Saya "+super.nama+" sudah menyelesaikan TESIS");
    }
    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3,71");
    }
    @Override
    public void menjuaraiKompetisi(){
        System.out.println("Saya "+super.nama+" telah menjuarai Kompetisi INTERNASIONAL");
    }
    @Override
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya "+super.nama+" menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
