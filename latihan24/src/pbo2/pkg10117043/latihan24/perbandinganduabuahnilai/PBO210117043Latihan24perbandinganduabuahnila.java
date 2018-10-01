/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;
/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk membandingkan 
 *                        dua buah nilai
 * @author Acer
 */
public class  PBO210117043Latihan24perbandinganduabuahnila  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka1,angka2;
        String action;
        angka1=0;
        angka2=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("=========Program Perbandingan Nilai==========");
        do{
        System.out.print("masukkan nilai pertama: ");angka1=scn.nextInt();
        System.out.print("masukkan nilai kedua: ");angka2=scn.nextInt();
        
        if(angka1>angka2){
            System.out.println("hasil: " +angka1 + " lebih besar dari"+ angka2+"\n");
            
        }else if(angka1<angka2){
          System.out.println("hasil: " +angka1 + " lebih kecil dari"+ angka2+"\n");  
        }else{
            System.out.println("hasil: " + angka1 + "sama dengan" + angka2 + "\n");
        }
        
        System.out.println("ulangi aktifitas?(Ya/Tidak)");
       action = scn.next();
        System.out.println("");
        
    }while (!action.equals("Tidak"));
        
    }
 
}
