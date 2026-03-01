package JavaSemester1.Pertemuan5;
import java.util.Scanner;
public class LogikaAkses {
    public static void main(String[] args) {
      
        int PinRahasia = 1234;
        boolean isAkunTerblokir = true;

        System.out.println("Masukkan PIN untuk akses fitur: ");
        Scanner input = new Scanner(System.in);
        int pinInput = input.nextInt();
        
        if (!isAkunTerblokir && pinInput == PinRahasia) {
            System.out.println("Akses Diberikan, Selamat datang!");

            int PilihanMenu = 1;

            switch (PilihanMenu) {
                case 1:
                    System.out.println("Aksi yang dijalankan: Menampilkan data rahasia.");
                    break;
                case 2:
                    System.out.println("Aksi yang dijalankan: Menghapus data.");
                    break;      
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }     
        }else {
            System.out.println("Akses Ditolak, PIN Salah atau Akun Terblokir.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        input.close();
    }
}