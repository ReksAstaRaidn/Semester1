package JavaSemester1.Pertemuan10;

public class OrganisirData {
    public static void main(String[] args) {
        String [] nama = {"Andi", "Budi", "Citra", "Dewi", "Eka"};
        int [] umur = {19, 15, 25, 22, 18};




        int jumlahUmurDibawah20 = 0;
        for (int i = 0; i < 5; i++) {
            if (umur[i] < 20) {
                jumlahUmurDibawah20++;
            }
        }

        if (jumlahUmurDibawah20 == 0) {
            System.out.println("Tidak ada yang berumur dibawah 20 tahun.");
        }
        else {
            for (int i = 0; i < 5; i++) {
                if (umur[i] < 20) {
                    System.out.println("Nama: " + nama[i] + ", Umur: " + umur[i]);
                }
                if (umur[i] >= 20) {
                    System.out.println("Nama: " + nama[i] + ", Umur: " + umur[i]);
            } 

        }


    }
    
}} 
