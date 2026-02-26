package JavaSemester1.Pertemuan12;
import java.util.Scanner;
public class MenuModular {

    public static void tampilkanMenu () {
        System.out.println("Pilihan Menu Minuman: ");
        System.out.println("1. Teh Manis");
        System.out.println("2. Kopi Susu");
        System.out.println("3. Air Mineral");
        System.out.println("0. Keluar");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan = -1;

        while (pilihan != 0) {

            tampilkanMenu ();
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Teh Manis.");
                    break;
                case 2:
                    System.out.println("Anda memilih Kopi Susu.");
                    break;
                case 3:
                    System.out.println("Anda memilih Air Mineral.");
                    break;
                case 0:
                    System.out.println("Terima kasih! Program Keluar.");
                    break;
                default:
                    System.out.println("Maaf, Pilihan tidak tersedia.");
            }
        }
        input.close();
    }
}
