package JavaSemester1.Pertemuan12;

public class ContohMethod {

    //definition method
    public static void tampilkanSalam () {
        System.out.println("--------------------------------------------");
        System.out.println("Halo, Selamat datang di program saya!");
        System.out.println("--------------------------------------------");
    }
    
    //main method
    public static void main(String[] args) {
        System.out.println("Program dimulai...");
        
        tampilkanSalam();

        System.out.println("Melakukan pekerjaan lain...");

        tampilkanSalam();

        System.out.println("Program selesai.");
    }

}
