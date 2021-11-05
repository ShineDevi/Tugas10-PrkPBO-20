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
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rektor rek=new Rektor();
        
        Mahasiswa mhs=new Mahasiswa("Charlie");
        Sarjana sCumlaude = new Sarjana ("Dini");
        PascaSarjana psCumlaude = new PascaSarjana("Elok");
        
        //rek.beriSertifikatCumlaude(mhs);
        rek.beriSertifikatCumlaude(sCumlaude);
        rek.beriSertifikatCumlaude(psCumlaude);
    }
    
}
