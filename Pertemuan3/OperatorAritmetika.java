package JavaSemester1.Pertemuan3;

public class OperatorAritmetika {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        int hasilpenjumlahan = a + b;
        System.out.println("hasil " + a + " + " + b + " = " + hasilpenjumlahan);

        int hasilpengurangan = a - b;
        System.out.println("hasil " + a + " - " + b + " = " + hasilpengurangan);

        int hasilperkalian = a * b; 
        System.out.println("hasil " + a + " * " + b + " = " + hasilperkalian);

        int hasilpembagian = a / b;
        System.out.println("hasil " + a + " / " + b + " = " + hasilpembagian);

        int hasilmodulus = a % b; 
        System.out.println("hasil " + a + " % " + b + " = " + hasilmodulus);
        
    }
    
}