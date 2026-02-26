package JavaSemester1.Pertemuan10;

public class UrutkanAngka {
    public static void main(String[] args) {
        int[] angka = {8, 29, 64, 17, 45, 21, 9};

        System.out.println("Array sebelum diurutkan: ");
        for (int item : angka) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    // swap position
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
        System.out.println("Array setelah diurutkan: ");
        for (int item : angka) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
}
