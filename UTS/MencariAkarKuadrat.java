package JavaSemester1.UTS;
import java.util.Scanner;
public class MencariAkarKuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int N = input.nextInt();
        double akar = Math.sqrt(N);
        System.out.printf("%.2f", akar);
        input.close();
        
    }
    
}
