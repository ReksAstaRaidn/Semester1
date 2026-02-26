package JavaSemester1.UTS;
import java.util.Scanner;
public class PolaBilanganSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int N = input.nextInt();
        
        int total = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                total += j;
                System.out.print(total);
            }
            System.out.println();
        }
        input.close();
    }
    
}
