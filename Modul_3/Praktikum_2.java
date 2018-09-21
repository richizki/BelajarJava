package Modul_3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bangadam
 */
public class Praktikum_2 {
    public static void main(String[] args) throws IOException {
        int hasil2, c,d;
         
        System.out.println("======Use JOptions Pane=======");
        c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai A = "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai B = "));
        hasil2 = c+d;
        JOptionPane.showMessageDialog(null, "Hasil nilai a+b =" +hasil2);
    }
}
