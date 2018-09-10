/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siti.fatimah;

/**
 *
 * @author Ayu Savira
 */
public class SitiFatimah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 5;
        for (int i=1; i<=jumlah; i++) {
            for (int k=1; k<=i; k++) {
                System.out.print("X");  
            }
            System.out.println();
        }
    }
    
}
