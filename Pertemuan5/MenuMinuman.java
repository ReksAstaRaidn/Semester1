package JavaSemester1.Pertemuan5;
import java.util.Scanner;   
public class MenuMinuman {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("PILIHAN MENU MINUMAN");
    System.out.println("1. Teh Manis");
    System.out.println("2. Kopi Susu");
    System.out.println("3. Air Mineral");
    System.out.println("Masukkan pilihan Anda (1-3): ");
    int pilihan = input.nextInt();

    switch (pilihan) {
        case 1:
            System.out.println("Anda memilih Teh Manis. Harga: Rp 5.000");            
            break;
        case 2:
            System.out.println("Anda memilih Kopi Susu. Harga: Rp 7.000");
            break;
        case 3:
            System.out.println("Anda memilih Air Mineral. Harga: Rp 3.000");
            break;
        default:
            System.out.println("Maaf, pilihan tidak tersedia.");

    }
      
    System.out.println("Terima Kasih");
    input.close();
        
    }
    
}
