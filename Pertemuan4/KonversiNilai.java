package JavaSemester1.Pertemuan4;

import java.util.Scanner;

public class KonversiNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai anda (0-100): ");
        int nilai = input.nextInt();
        String indeks = "";

        if (nilai >= 80 && nilai <= 100) {
            indeks = "A";
        } else if (nilai >= 70 && nilai < 80) {
            indeks = "B";
        } else if (nilai >= 60 && nilai < 70) {
            indeks = "C";
        } else if (nilai >= 50 && nilai < 60) {
            indeks = "D";
        } else if (nilai >= 0 && nilai < 50) {
            indeks = "E";
        } else {
            indeks = "Nilai tidak valid";
        }
            System.out.println("Indeks nilai anda adalah: " + indeks);
            input.close();
    }    
}

