import java.util.Scanner;

public class PembelianBarang2 {
public static void main(String[] args) {
    double total, Diskon, pothar;

    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Total Pembelian: ");
    total = input.nextDouble();
     if (total > 150000) {
        pothar = 0;
        Diskon =0.1 * total;
        total -= Diskon;
     } else {
        Diskon = 0;
        pothar = 5000;
        total -= pothar;
     }

     System.out.println("Diskon:" + Diskon);
     System.out.println("Potongan Harga: "+pothar);
     System.out.println("Total yang harus dibayarkan: "+ total);
}

    }
    

