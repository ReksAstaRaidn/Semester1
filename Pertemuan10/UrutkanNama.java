package JavaSemester1.Pertemuan10;

public class UrutkanNama {
    public static void main(String[] args) {
        
        String[] nama = {"Budi", "Zahra", "Adi", "Cici"};

        System.out.println("Array sebelum diurutkan: ");
        for (String item : nama) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int i = 0; i < nama.length - 1; i++) {
            for (int j = 0; j < nama.length - 1 - i; j++) {
                if (nama[j].compareTo(nama[j + 1]) > 0) {
                    // swap position
                    String temp = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = temp;
                }
            }
        }
        System.out.println();
        
        System.out.println("Array setelah diurutkan: ");
        for (String item : nama) {
            System.out.print(item + " ");
        }

    }
}
