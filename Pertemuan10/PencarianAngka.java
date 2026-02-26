package JavaSemester1.Pertemuan10;
import java.util.Scanner;
public class PencarianAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);    

        int[] daftarAngka = {17, 45, 8, 29, 64, 21, 9};

        System.out.print("Masukkan angka yang ingin dicari:  ");
        int angkaDicari = input.nextInt();

        boolean ditemukan = false;
        int indexDitemukan = -1;

        for (int i = 0; i < daftarAngka.length; i++) {
            if (daftarAngka[i] == angkaDicari) {
                ditemukan = true;
                indexDitemukan = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka " + angkaDicari + " ditemukan pada indeks ke-" + indexDitemukan);
        } else {
            System.out.println("Maaf, Angka " + angkaDicari + " tidak ditemukan dalam array.");
        }

        input.close();
    }
    
}
