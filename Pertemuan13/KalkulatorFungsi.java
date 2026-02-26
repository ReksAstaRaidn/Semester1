package JavaSemester1.Pertemuan13;

public class KalkulatorFungsi {

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static int pangkatDua(int angka){
        return angka * angka; //bisa langsung return
    }
    
    public static void main(String[] args){
        double luasPersegi = hitungLuas(10.5, 5.0);
        System.out.println("Luas Persegi Panjang: " + luasPersegi);

        int hasilPangkat = pangkatDua(8);
        System.out.println("8 Pangkat 2 adalah: " + hasilPangkat);

        System.out.println("5 Pangkat 2 adalah: " + pangkatDua(5)); //bisa langsung panggil
    }
}
