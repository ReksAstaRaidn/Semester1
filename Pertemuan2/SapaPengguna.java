package JavaSemester1.Pertemuan2;

import java.util.Scanner;

public class SapaPengguna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-PROGRAM SAPA PENGGUNA-");

        System.out.println("Siapa nama depan kamu? ");
        String namaDepan = input.nextLine();

        System.out.println("Siapa nama belakang kamu? ");
        String namaBelakang = input.nextLine();

        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println("Halo, " + namaLengkap + "! Senang bertemu denganmu!");

        input.close();
    }
}
