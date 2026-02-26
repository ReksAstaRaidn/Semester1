package JavaSemester1.Pertemuan11;

public class DenahBioskop {
    public static void main(String[] args) {
        
        String [][] DenahBioskop = new String [4][5];

        for (int i = 0; i < 4 ; i++) {

            for (int j = 0; j < 5 ; j++) {

            

                DenahBioskop[i][j] = "Baris " + (i + 1) + " Kursi " + (j + 1);
            } 
        }

        
        System.out.println("Denah Kursi Bioskop: ");
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(DenahBioskop[i][j] + "\t" + "\t");
            } 
            System.out.println();
        }

           

    }
    
}
