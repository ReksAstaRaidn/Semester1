package JavaSemester1.UTS;
import java.util.Scanner;
public class HitungUmurLansia {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int tahunLahir = input.nextInt();
        int tahunSekarang = 2025;

        int umur = tahunSekarang - tahunLahir;

        if (umur < 18) {
            System.out.println(umur);
            System.out.println("Belum Dewasa");
        } else if (umur >= 18 && umur <= 59) {
            System.out.println(umur);
            System.out.println("Dewasa");
        } else if (umur >= 60) {
            System.out.println(umur);
            System.out.println("Lansia");
        }
        

     
        input.close();
    }
    
}
