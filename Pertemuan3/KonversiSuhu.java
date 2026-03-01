package JavaSemester1.Pertemuan3;
import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("selamat datang di program konversi suhu");
        System.out.print("masukkan suhu dalam celcius: ");
        double celcius = input.nextDouble();  


        double fahrenheit = (celcius * 9/5)  + 32;

        System.out.println(celcius + " derajat celcius = " + fahrenheit + " derajat fahrenheit");

        System.out.println("Konversi ke reamur, masukkan suhu dalam celcius: ");
        double celcius2 = input.nextDouble();

        double reamur = celcius2 * 4/5;
        System.out.println(celcius2 + " derajat celcius = " + reamur + " derajat reamur");

        System.out.println("Konversi ke kelvin, masukkan suhu dalam celcius: ");
        double celcius3 = input.nextDouble();

        double kelvin = celcius3 + 273.15;
        System.out.println(celcius3 + " derajat celcius = " + kelvin + " derajat kelvin");
    
        input.close();
    }
}
