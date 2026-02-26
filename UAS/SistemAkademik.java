package JavaSemester1.UAS;

import java.util.Scanner;

public class SistemAkademik {
    // Global Variables (Data disimpan di sini)
    static int MAX_DATA = 100;
    static String[] namaMhs = new String[MAX_DATA];
    static double[] nilaiAkhir = new double[MAX_DATA];
    static String[] nilaiHuruf = new String[MAX_DATA];
    static int jumlahData = 0; // Penanda berapa data yang sudah terisi
    
    static Scanner input = new Scanner(System.in);
 
    public static void main(String[] args) {
        int menu = -1;
        while (menu != 0) {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); // Membersihkan buffer
 
            switch (menu) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 0:
                    System.out.println("Keluar program.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
 
    static void tampilkanMenu() {
        System.out.println("\n=== MENU UTAMA ===");
        System.out.println("1. Input Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("0. Keluar");
    }
 
    static void inputData() {
        if (jumlahData >= MAX_DATA) {
            System.out.println("Penyimpanan penuh!");
            return;
        }
        
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nilai Akhir (0-100): ");
        double nilai = input.nextDouble();
        


        // --- TUGAS 1: SIMPAN DATA KE ARRAY ---
        // TOD: Simpan variabel 'nama' ke array 'namaMhs' di posisi 'jumlahData'
        // TOD: Simpan variabel 'nilai' ke array 'nilaiAkhir' di posisi 'jumlahData'
        namaMhs[jumlahData] = nama;
        nilaiAkhir[jumlahData] = nilai;
        
        // --- TUGAS 2: KONVERSI NILAI HURUF ---
        // TOD: Gunakan if-else untuk menentukan nilaiHuruf berdasarkan nilai
        // A (>=85), B (>=70), C (>=55), D (>=40), E (<40)
        // Simpan hasilnya ke array 'nilaiHuruf' di posisi 'jumlahData'
        if (nilai >= 85) {
            nilaiHuruf[jumlahData] = "A";
        } else if (nilai >= 70) {
            nilaiHuruf[jumlahData] = "B";
        } else if (nilai >= 55) {
            nilaiHuruf[jumlahData] = "C";
        } else if (nilai >= 40) {
            nilaiHuruf[jumlahData] = "D";
        } else {
            nilaiHuruf[jumlahData] = "E";
        }
        
        // --- TUGAS 3: UPDATE JUMLAH DATA ---
        // TOD: Tambahkan 1 ke variabel 'jumlahData' agar data berikutnya tidak menimpa
        jumlahData++;
        
        System.out.println("Data berhasil disimpan!");
    }
    
 
    static void tampilkanData() {
        System.out.println("\n=== DAFTAR NILAI ===");
        
        // --- TUGAS 4: LOOPING ARRAY ---
        // TOD: Buat perulangan 'for' dari 0 sampai kurang dari 'jumlahData'
        // Di dalam loop, tampilkan: Nama, Nilai Akhir, dan Nilai Huruf
        for (int i = 0; i < jumlahData; i++) {
            System.out.println((i + 1) + ". " + namaMhs[i] + " - " + nilaiAkhir[i] + " (" + nilaiHuruf[i] + ")");
        }
        // Contoh format output: "1. Budi - 80.0 (B)"
    }
}

