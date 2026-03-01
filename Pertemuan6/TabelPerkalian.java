package JavaSemester1.Pertemuan6;
import java.util.Scanner;
public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            System.out.print("Masukkan sebuah angka untuk dibuat tabel perkalian: ");
            int angka = input.nextInt();

            System.out.println("===Tabel Perkalian " + angka + "===");

            for (int i = 1; i <= 10; i++) {
                int hasil = angka * i;
                System.out.println(angka + " x " + i + " = " + hasil);
            }
        input.close();  
    }
}
