package JavaSemester1.Pertemuan3;
import java.util.Scanner;
public class KonversiJam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("selamat datang di program konversi jam");

        System.out.println("masukkan total detik:");
        int totalDetik = input.nextInt();

        int jam = totalDetik / 3600;
        int menit = (totalDetik % 3600) / 60;
        int detik = totalDetik % 60;

        System.out.println("hasil dari konversi jam adalah: " + jam + " jam, " + menit + " menit, " + detik + " detik");
        
        input.close();
    }


}
