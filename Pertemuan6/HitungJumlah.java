package JavaSemester1.Pertemuan6;
import java.util.Scanner;
public class HitungJumlah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka: ");
        int n = input.nextInt();
            
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i; 
        }
            System.out.println("hasilnya adalah: " + total);
        input.close();
    }
    
}
