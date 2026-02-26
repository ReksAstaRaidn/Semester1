package JavaSemester1.UTS;

import java.util.Scanner;

public class Klasifikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int N = input.nextInt();

        if (N > 0 && N % 2 == 0) {
            System.out.println("Positif Genap");
        } else if (N > 0 && N % 2 != 0) {
            System.out.println("Positif Ganjil");
        } else if (N < 0 && N % 2 == 0) {
            System.out.println("Negatif Genap");
        } else if (N < 0 && N % 2 != 0) {
            System.out.println("Negatif Ganjil");
        } else {
            System.out.println("Genap");
        
            
        }
        input.close();
        
    }
    
}
