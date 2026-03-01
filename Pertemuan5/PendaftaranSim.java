package JavaSemester1.Pertemuan5;
import java.util.Scanner;
public class PendaftaranSim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.println("Masukkan umur anda: ");
      int umur = input.nextInt();

        if (umur >= 17) {
            System.out.println("Apakah anda sudah lolos ujian teori? (Y/N)");
            char statusUjian = input.next().charAt(0);

            if (statusUjian == 'Y' || statusUjian == 'y') {
                System.out.println("Selamat! Anda berhak membuat SIM!.");
            }
                else {
                System.out.println("Maaf, anda harus lulus ujian teori terlebih dahulu.");
            }
        } else {
            System.out.println("Maaf, anda belum cukup umur untuk membuat SIM.");

        input.close();
    }
    }}
