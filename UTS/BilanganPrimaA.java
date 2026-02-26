package JavaSemester1.UTS;
import java.util.Scanner;
public class BilanganPrimaA {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         
        int N = input.nextInt();
        int primaSelanjutnya = N + 1;

        while (true) {
            boolean isPrime = true;
            
        for (int i = 2; i * i <= primaSelanjutnya; i++) {
                if (primaSelanjutnya % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(primaSelanjutnya);
                break;
            }
            primaSelanjutnya++;
            input.close();
        }
    }
    
}
