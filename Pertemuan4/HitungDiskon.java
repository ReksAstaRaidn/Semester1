package JavaSemester1.Pertemuan4;
import java.util.Scanner;
public class HitungDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan total harga belanjaan anda:");
        int totalHarga = input.nextInt();

        if (totalHarga < 100000) {
            System.out.println("anda tidak mendapatkan diskon");
            System.out.println("total yang harus dibayar: " + totalHarga);

        } else if (totalHarga >= 100000 && totalHarga <= 500000) {
            int diskon = totalHarga * 10 / 100;
            int hargaSetelahDiskon = totalHarga - diskon;
            System.out.println("anda mendapatkan diskon 10%");
            System.out.println("total yang harus dibayar: " + hargaSetelahDiskon);

        } else if (totalHarga > 500000) {
            int diskon = totalHarga * 20 / 100;
            int hargaSetelahDiskon = totalHarga - diskon;
            System.out.println("anda mendapatkan diskon 20%");
            System.out.println("total yang harus dibayar: " + hargaSetelahDiskon);
        }
        input.close();
    }
    
}
