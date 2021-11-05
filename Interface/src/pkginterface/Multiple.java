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
public class Multiple {
    public static void main(String[] args) {
        Rektor rek=new Rektor();

        Sarjana sCumlaude = new Sarjana ("Dini");
        PascaSarjana psCumlaude = new PascaSarjana("Elok");
        
        //rek.beriSertifikatMawapres(sCumlaude);
        rek.beriSertifikatMawapres(psCumlaude);
    }
}
