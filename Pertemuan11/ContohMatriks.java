package JavaSemester1.Pertemuan11;

public class ContohMatriks {
    public static void main(String[] args) {
        int[][] matriks = new int [2][3];


        matriks[0][0] = 10;
        matriks[0][1] = 20;
        matriks[0][2] = 30; 
        matriks[1][0] = 40;
        matriks[1][1] = 50;
        matriks[1][2] = 60;

        System.out.println("Isi Matriks: ");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(matriks[i][j] + "\t");
            } 
            System.out.println();
        } 
    }
    
}
