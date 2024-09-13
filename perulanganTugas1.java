package Perulangan;
import java.util.Scanner;

public class perulanganTugas1 {
    public static void main(String[] args) {
        int jumlahSiswa , nilaiSiswa = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa");
        jumlahSiswa = s.nextInt();
        
        int TotalNilai=0;

        for (int i = 1; i <=jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa "+ i +": ");
            nilaiSiswa = s.nextInt();
            TotalNilai+=nilaiSiswa;
        }

        double ratarata = TotalNilai / jumlahSiswa;
        System.out.println("total nilai: "+ TotalNilai);
        System.out.println("ratarata nilai: "+ ratarata);
    }
    
}
