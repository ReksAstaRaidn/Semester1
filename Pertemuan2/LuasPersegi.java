package JavaSemester1.Pertemuan2;

import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang persegi panjang: ");

        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();
        
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang dengan panjang "+ panjang + " dan lebar " + lebar + " adalah: " + luas);
        
        input.close();
    }
}
