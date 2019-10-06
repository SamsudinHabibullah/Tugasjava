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
public class Tugasjava6A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jmlbeli,hrgprinter,tot;
        
        Scanner tambahjml = new Scanner(System.in);
        Scanner pesanbaru = new Scanner(System.in);
        

        System.out.println("Printer EPSON T2 : Rp. 660.000");
        System.out.print("Masukkan jml beli = ");
        jmlbeli=tambahjml.nextInt();
        
        hrgprinter=660000;
        tot=jmlbeli*hrgprinter;
        System.out.println("jml beli = "+jmlbeli);
        System.out.println("rincian beli = "+jmlbeli+" * "+ hrgprinter);
        System.out.println("tot harga = "+tot);
       
     
 
         
      
       
        
    
        
        
    }
    }
    
