package JavaSemester1.UTS;
import java.util.Scanner;
public class KoneversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int N = input.nextInt();

        int jam = N / 3600;
        int sisaJam = N % 3600;
        int menit = sisaJam / 60;
        int Detik = sisaJam % 60;

        System.out.printf(jam + ":" + menit + ":" + Detik);
        input.close();
    }
    
}
