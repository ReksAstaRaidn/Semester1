package JavaSemester1.Pertemuan11;

public class JumlahMatriks {
    public static void main(String[] args) {
        
        int [][] matriksA = new int [2][2];
        int [][] matriksB = new int [2][2];

        matriksA[0][0] = 1;
        matriksA[0][1] = 2;
        matriksA[1][0] = 3;
        matriksA[1][1] = 4;

        matriksB[0][0] = 5;
        matriksB[0][1] = 6;
        matriksB[1][0] = 7;
        matriksB[1][1] = 8;

               System.out.println("Matriks A:");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(matriksA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matriks B:");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(matriksB[i][j] + "\t");
            }
            System.out.println();
        }

        int [][] matriksHasil = new int [2][2];
        System.out.println();
        System.out.println("Hasil Penjumlahan Matriks:");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(matriksHasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
