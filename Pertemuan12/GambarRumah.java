package JavaSemester1.Pertemuan12;

public class GambarRumah {

    public static void gambarAtap (){
        System.out.println("/\\ \\");
    }
    public static void gambarDinding (){
        System.out.println("|  |");
    }
    public static void gambarDasar (){
        System.out.println("----");
    }
    public static void main(String[] args) {
        gambarAtap();
        gambarDinding();
        gambarDasar();
    }
}
