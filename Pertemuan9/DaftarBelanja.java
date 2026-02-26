package JavaSemester1.Pertemuan9;
public class DaftarBelanja {
    public static void main(String[] args) {
        String[] daftarBelanja = new String[5];

        daftarBelanja[0] = "Beras";
        daftarBelanja[1] = "Minyak";
        daftarBelanja[2] = "Gula";
        daftarBelanja[3] = "Telur";
        daftarBelanja[4] = "Kopi";

        System.out.println("Daftar Belanja Hari Ini:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + daftarBelanja[i]);
        }
    }
    
}
