/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-PEMROGRAMAN.9
 */
public class Praktikum_4 {
    public static void main(String[] args) {
        int bilangan =0, batas = 5, hasil=0;
         
        for (int i = 0; i <batas; i++) {
            bilangan = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Masukkan Bilangan sebanyak 5 kali, " +i+" kali"));
            hasil+=bilangan;
            
            if (hasil%2 == 1) {
             System.out.println("Angka "+bilangan+" termasuk Bilangan ganjil");
            } else {
                System.out.println("Angka "+bilangan+" termasuk Bilangan Genap");
            }
        }
        
        
        System.out.println("Total jumlah Bilangan = "+ hasil);
    }
}
