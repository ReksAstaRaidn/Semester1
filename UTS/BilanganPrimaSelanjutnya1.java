package JavaSemester1.UTS;
import java.util.Scanner;
public class BilanganPrimaSelanjutnya1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int N = input.nextInt();
        int nextPrime = N + 1;
        int sisaPrima = nextPrime % nextPrime;

        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= nextPrime; i++) {
                if (nextPrime % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(nextPrime + sisaPrima);
                break;
            }
            nextPrime++;
        }
        input.close();
    }
    
}
