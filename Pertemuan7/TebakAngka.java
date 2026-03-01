package JavaSemester1.Pertemuan7;

import java.util.Scanner;  

public class TebakAngka {
   public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int angkaRahasia = 7;
    int tebakan = 0;

    System.out.println("---Selamat Datang di Game Tebak Angka---");    
    System.out.println("Saya telah memilih sebuah angka antara 1-10. Coba tebak!");

    while (tebakan != angkaRahasia) {
        System.out.print("Masukkan tebakan Anda: ");
        tebakan = input.nextInt();

        if (tebakan == angkaRahasia) {
            System.out.println("Selamat! Tebakan Anda benar.");
        } else {
            System.out.println("Salah! Coba lagi!");
        }
        
    }

    System.out.println("Terima kasih telah bermain!");

    input.close();
   }
}
