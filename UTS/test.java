package JavaSemester1.UTS;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int N = input.nextInt();
        int nextPrime = N + 1;
        int sisaPrima = nextPrime / nextPrime;

        System.out.println(nextPrime + sisaPrima);

       
        input.close();
    }
    
}
