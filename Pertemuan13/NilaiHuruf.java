package JavaSemester1.Pertemuan13;
import java.util.Scanner;
public class NilaiHuruf {

    public static String getIndeksNilai(int nilaiAngka){
        if(nilaiAngka >= 85 && nilaiAngka <= 100){
            return "A";
        } else if (nilaiAngka >= 70 && nilaiAngka < 85){
            return "B";
        } else if (nilaiAngka >= 55 && nilaiAngka < 70){
            return "C";
        } else if (nilaiAngka >= 40 && nilaiAngka < 55){
            return "D";
        } else if (nilaiAngka >= 0 && nilaiAngka < 40){
            return "E";
        } else {
            return "Nilai invalid";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai angka (0-100): ");
        int nilaiAngka = input.nextInt();
        String indeksNilai = getIndeksNilai(nilaiAngka);
        
        System.out.println("Indeks nilai untuk angka " + nilaiAngka + " adalah: " + indeksNilai);
        

        input.close();
    }
    
}
