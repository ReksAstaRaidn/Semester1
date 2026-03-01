package JavaSemester1.Pertemuan2;

import java.util.Scanner;

public class HitungUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int TahunSekarang = 2025; 

        System.out.println("---PROGRAM HITUNG UMUR---");

        System.out.print("Masukkan Nama Lengkap Anda: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tahun Lahir Anda: ");
        int tahunLahir = input.nextInt();

        int umur = TahunSekarang - tahunLahir;
        System.out.println("Halo, " + namaLengkap + "! Umur Anda saat ini adalah " + umur + " tahun.");

        input.close();
    }
    
}
