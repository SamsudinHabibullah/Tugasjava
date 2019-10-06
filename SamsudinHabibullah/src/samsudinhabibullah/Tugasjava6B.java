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
public class Tugasjava6B {
   public static void main (String[]args){
    int jmlbeli,hrgprinter,total;
    double diskon,hrgdiskon,jmltot;
        
        Scanner inputqty = new Scanner(System.in);
        
      
        System.out.println("Printer EPSON T2 : Rp. 660.000");
        System.out.print("Masukkan jumlah beli = ");
        jmlbeli=inputqty.nextInt();
        
        hrgprinter=660000;
        total=jmlbeli*hrgprinter;
        if(total>1500000)
        {
            diskon=0.15;
            hrgdiskon =total*diskon;
            jmltot=total-hrgdiskon;
            
            System.out.println("jumlah beli = "+jmlbeli);
        System.out.println("rincian beli = "+jmlbeli+" * "+ hrgprinter);
        System.out.println("total harga = "+total);
        System.out.println("anda mendapatkan diskon = "+hrgdiskon);
        System.out.println("jumlah total = "+jmltot);
        }else{
             diskon=0;
            hrgdiskon =total*diskon;
            jmltot=total-hrgdiskon;
            System.out.println("jumlah beli = "+jmlbeli);
        System.out.println("rincian beli = "+jmlbeli+" * "+ hrgprinter);
        System.out.println("total harga = "+total);
        System.out.println("anda mendapatkan diskon = "+diskon);
        System.out.println("jumlah total = "+jmltot);
        }
        }
}
