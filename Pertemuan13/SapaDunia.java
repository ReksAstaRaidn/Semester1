package JavaSemester1.Pertemuan13;

public class SapaDunia {
    public static void sapa (String nama, String kota) {
        System.out.println("Halo " + nama + "!");
        System.out.println("Senang Bertemu Denganmu di " + kota + "!");
    }

    public static void main(String[] args) {
        sapa("Agus", "Yogyakarta");

        System.out.println("----------------");
        
        sapa("Citra", "Jakarta");
    }
    
}
