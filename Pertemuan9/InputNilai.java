package JavaSemester1.Pertemuan9;
import java.util.Scanner;
public class InputNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa:");
        int jumlah = input.nextInt();

        double[] nilai = new double[jumlah];

        System.out.println("--------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }

        System.out.println("--------------------");
        System.out.println("Daftar nilai yang dimasukkan: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        input.close();
        
    }
    
}
