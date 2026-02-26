package JavaSemester1.UTS;
import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
    
}
