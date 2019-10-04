/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan24.perbandinganduabuahnilai;
import java.util.*;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menbandingkan dua buah nilai variabel dengan loop
 */
public class PBO11K10118901Latihan24PerbandinganDuaBuahNilai {
    public static Scanner input = new Scanner(System.in);
    public static void bandingkan(int b1, int b2){
        if (b1 > b2)
            System.out.println(b1+" Lebih besar dari "+ b2);
        else if(b1 < b2)
            System.out.println(b1+" Lebih kecil dari "+b2);
        else 
            System.out.println(b1+" Sama dengan " +b2);
    }
    public static void main(String[] args) {
        String ulangi = "Ya";
        int bil1,bil2;
        
        System.out.println("========Program Perbandingan Nilai=========");
        do {
            System.out.print("Masukan nilai pertama : ");
            bil1 = input.nextInt();
            System.out.print("Masukan nilai kedua : ");
            bil2 = input.nextInt();
            bandingkan(bil1,bil2);
            System.out.println("");
            System.out.print("Ulangi Aktifitas? (Ya/Tidak) : ");
            ulangi = input.next();
        } while(ulangi.equals("Ya"));
    }
    
}
