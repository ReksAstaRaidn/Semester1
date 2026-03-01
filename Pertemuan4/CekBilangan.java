package JavaSemester1.Pertemuan4;
import java.util.Scanner;
public class CekBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sebuah bilangan bulat:");
        int bilangan = input.nextInt();

        if(bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
        System.out.println("program selesai");
        input.close();
    }
}
