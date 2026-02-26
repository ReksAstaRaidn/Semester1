package JavaSemester1.Pertemuan10;
import java.util.Scanner;
public class HitungKemunculan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int[] dataAngka = {4, 1, 8, 7, 4, 1, 4};
        
        System.out.print("Masukkan angka yang ingin dihitung kemunculannya: ");
        int angkaDicari = input.nextInt();

        int kemunculan = 0;
        for (int angka : dataAngka) {
            if (angka == angkaDicari) {
                kemunculan++;
            }
        }
        System.out.println("Angka " + angkaDicari + " muncul sebanyak " + kemunculan + " kali.");

        input.close();
    }
    
}
