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
public class MainProgram {
    public static void main(String[] args) {
        Keledai k=new Keledai("Keledai", 4, "Hee-Haw!","Abu-abu");
        k.displayData();
        System.out.println("======================================");
        Singa s=new Singa("Singa", 4, "ROARRR!", "Coklat muda");
        s.displayData();
        System.out.println("======================================");
        Gorilla g=new Gorilla("Gorilla", 2, "Umm-umm", "hitam");
        g.displayData();
    }
}
