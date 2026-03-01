package JavaSemester1.Pertemuan4;
import java.util.Scanner;
public class CekKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan nilai akhir ujian anda:");
        int nilai = input.nextInt();

        if (nilai >= 70) {
            System.out.println("Selamat, anda lulus!");
        } else {
            System.out.println("Maaf, anda harus mencoba lagi semester depan.");
        }
        input.close();
    }
}
