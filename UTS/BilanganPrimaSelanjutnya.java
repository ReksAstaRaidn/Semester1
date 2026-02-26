package JavaSemester1.UTS;

import java.util.Scanner;

public class BilanganPrimaSelanjutnya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int bilanganPrima = N + 1;
        while (true) {
            boolean isPrima = true;
            for (int i = 2; i <= Math.sqrt(bilanganPrima); i++) {
                if (bilanganPrima % i == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima) {
                System.out.println(bilanganPrima);
                break;
            }
            bilanganPrima++;
        }

        input.close();
    }

    
}
