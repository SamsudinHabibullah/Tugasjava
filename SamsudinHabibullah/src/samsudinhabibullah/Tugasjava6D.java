/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samsudinhabibullah;

import java.util.Scanner;

/**
 *
 * @author Fandanu
 */
public class Tugasjava6D {
     public static void main (String[]args){
        int upah,jamkerja,total;
        double pajak,totupahpajak,jumlahtotal;
        

        Scanner inputjamkerja= new Scanner(System.in);
 
        
        System.out.println("Upah Karyawan Per jam : Rp. 2.500");
        System.out.println("Pajak Karyawan : 15%");
        System.out.print("Masukkan lama jam kerja = ");
        jamkerja=inputjamkerja.nextInt();
        
        pajak = 0.15;
        upah=2500;
        total = upah * jamkerja;
        totupahpajak =total *pajak;
      jumlahtotal = total-totupahpajak;
      
        System.out.println("Jam kerja : "+jamkerja+" jam");
        System.out.println("Rincian Jam kerja : "+jamkerja+" * "+upah);
        System.out.println("Total Sebelum Pajak : Rp."+total);
        System.out.println("Jumlah Pajak: Rp."+totupahpajak);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Total Upah Karyawan : Rp. "+jumlahtotal);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
   
        System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");
     
        } 

        
}
