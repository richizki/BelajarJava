/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Praktikum_4 {
    public static void main(String[] args) {
        int data[][] = {
            {2,9,5,17},
            {1,5,10,4}
        };
        int nilai = Integer.parseInt(JOptionPane
                .showInputDialog("Masukkan Nilai"));
        // ubah nilai
        data[0][1] = nilai;
        
        int total = 0;
                
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("["+i+"]["+j+"] => "+data[i][j]);
                total += data[i][j];
            }
            System.out.println();
        }
        
        System.out.println("Total Jumlah Semua Array => "+total);
    }
}
