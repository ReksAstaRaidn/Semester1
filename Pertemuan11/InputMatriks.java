package JavaSemester1.Pertemuan11;
import java.util.Scanner;
public class InputMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int [][] matriks = new int [baris][kolom];

        System.out.println("Masukkan elemen matriks: ");
        for (int i = 0; i < baris; i++) {

            for (int j = 0; j < kolom; j++) {
                
                System.out.print("Masukkan elemen untuk Baris " + i + ", Kolom " + j + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks yang dimasukkan adalah: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
    
}
