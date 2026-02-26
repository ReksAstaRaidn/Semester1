package JavaSemester1.Pertemuan9;

import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        double[] data = new double[jumlah];

        System.out.println("--------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += data[i];
        }

        double rataRata = total / jumlah;

        System.out.println("--------------------");
        System.out.println("Rata-rata dari data yang dimasukkan: " + rataRata);
        
        input.close();
        
    }
    
}
