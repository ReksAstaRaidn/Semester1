package JavaSemester1.Pertemuan13;

public class CariTerbesar {

    public static int cariMaks(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }


    }
    public static void main(String[] args) {
        int nilai1 = 45;
        int nilai2 = 78;

        int nilaiTerbesar = cariMaks(nilai1, nilai2);
        System.out.println("Nilai Terbesar antara " + nilai1 + " dan " + nilai2 + " adalah: " + nilaiTerbesar);
    }
    
}
