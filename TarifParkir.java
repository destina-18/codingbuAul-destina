import java.util.Scanner;

 class TarifParkir {
    public static void main(String[] args) {
        String platNomor;
        double harga;
        int jumlahJam;

        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nomor Plat: ");
        platNomor = s.nextLine();
        System.out.print("Jumlah Jam: ");
        jumlahJam = s.nextInt();

        if  (jumlahJam >0 && jumlahJam <=1){
            harga=3000;
        }else if (jumlahJam >1 && jumlahJam<=4){
            harga=7000;
        }else if(jumlahJam > 4){
            harga = 10000;
        }else{
            harga = 0;
            System.out.println("System Eror");
        }

        System.out.println(platNomor);
        System.out.println("Tarif Parkir "+harga);
    }
    
}
