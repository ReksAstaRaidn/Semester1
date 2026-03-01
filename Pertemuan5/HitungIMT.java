package JavaSemester1.Pertemuan5;

import java.util.Scanner;

public class HitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);   

        System.out.println("Masukkan berat badan anda (kg): ");
        double berat = input.nextDouble();

        System.out.println("Masukkan tinggi badan anda (m): ");
        double tinggi = input.nextDouble();

        double imt = berat / (tinggi * tinggi);

        if (imt < 18.5) {
            System.out.println("IMT anda: " + imt + ", Anda termasuk kategori Kekurangan Berat Badan.");
        } else if (imt >= 18.5 && imt < 25) {
            System.out.println("IMT anda: " + imt + ", Anda termasuk kategori Normal (Ideal).");
        } else if (imt >= 25 && imt < 30) {
            System.out.println("IMT anda: " + imt + ", Anda termasuk kategori Kelebihan Berat Badan.");
        } else {
            System.out.println("IMT anda: " + imt + ", Anda termasuk kategori Obesitas.");
        
        }

        

        input.close();
    }
    }

