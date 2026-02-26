package JavaSemester1.Pertemuan11;

public class soifhofh {

public static void main(String[] args) {
    
    int [][] matriksA = new int [2][2];
    

    matriksA[0][0] = 1;
    matriksA[0][1] = 2;
    matriksA[1][0] = 3;
    matriksA[1][1] = 4;

    for(int i = 0; i < 2; i++) {

        for (int j = 0; j < 2; j++) {

            System.out.print(matriksA[i][j] + "\t");
        }
        System.out.println();
    }

}
    
}
