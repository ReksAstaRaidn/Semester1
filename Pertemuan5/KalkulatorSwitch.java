package JavaSemester1.Pertemuan5;
import java.util.Scanner;
public class KalkulatorSwitch {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Masukkan angka pertama: ");
            double num1 = input.nextDouble();

            System.out.println("Masukkan Operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.println("Masukkan angka kedua ");
            double num2 = input.nextDouble();

        
            switch (operator) {
                case '+': 
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));                    
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));                    
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));                    
                    break;
                case '/': 
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("Tidak Bisa Membagi Dengan 0.");
                    }
                    break;
                default: 
                    System.out.println("Operator Tidak Valid.");
                    break;
            }

        
        input.close();

    }

    
    
}
