package JavaSemester1.Pertemuan3;

public class OperatorPenugasan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("nilai awal a = " + a);
        a += 5; // a = a + 5
        System.out.println("setelah a += 5, nilai a = " + a);

        System.out.println("nilai awal b = " + b);
        b -= 3;
        System.out.println("setelah b -= 3, nilai b = " + b);

        b *= 2;
        System.out.println("setelah b *= 2, nilai b = " + b);
    
    }
}
