import java.util. Scanner;
 
public class seleksiPrakerin {
    public static void main(String[] args) {
        String nama,kelas,perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Nama: ");
        nama = s.nextLine();
        System.out.println("Kelas: (X/XI/XII)");
        kelas = s.next();

        if(kelas.equalsIgnoreCase("XII")){
            System.out.println("Perilaku Siwa: (baik/cukup)");
            perilaku = s.next();
            if(perilaku.equalsIgnoreCase("baik")){
                System.out.println("Nilai Siswa: ");
                nilai = s.nextInt();
                if (nilai >=85) {
                    System.out.println(nama+ " dinyatakan bisa mengikuti prakerin");
                }else{
                    System.out.println("Maaf anda gagal karena nilai");
            }
            }else{
                System.out.println("anda gagal karena perilaku");
            }

            }else{
                System.out.println("anda gagal karena bukan kelas XII");
            }

            }
        }
    
    

