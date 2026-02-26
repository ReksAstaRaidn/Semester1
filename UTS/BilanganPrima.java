package JavaSemester1.UTS;
import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int N = input.nextInt();
        boolean isPrime = true;

        if (N <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(N + " adalah bilangan prima");
        } else {
            System.out.println(N + " bukan bilangan prima");
        }
        input.close();
        
    }
}
