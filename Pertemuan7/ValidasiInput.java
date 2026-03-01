package JavaSemester1.Pertemuan7;
import java.util.Scanner;
public class ValidasiInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Program Validasi Input");
        System.out.println("Masukkan angka positif: ");
        int angka = input.nextInt();

        while (angka <= 0) {
            System.out.println("Input tidak valid. Silakan masukkan angka positif: ");
            angka = input.nextInt();
            

            if (angka > 0) {
                System.out.println("Terima kasih, angka " + angka + " valid.");
                
                
            }
            
        }

        input.close();
    }
    
}
