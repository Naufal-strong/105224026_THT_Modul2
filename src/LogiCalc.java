import java.util.Scanner;

public class LogiCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nama Klien : ");
        String namaKlien = input.nextLine();

        System.out.print("Total Berat Barang (Kg) : ");
        double berat = input.nextDouble();

        System.out.print("Jarak Tujuan (Km) : ");
        int jarak = input.nextInt();

        System.out.print("Jumlah Total Box : ");
        int jumlahBox = input.nextInt();

        input.close();
    
        int kapasitasTruk = 150;
        int trukPenuh = jumlahBox / kapasitasTruk;  
        int sisaBox   = jumlahBox % kapasitasTruk;   
        int tarifJarak = 15000;
        int tarifBerat = 5500;
        double dasarBiaya  = (tarifJarak * jarak) + (tarifBerat * berat);
        double asuransi    = dasarBiaya * 3.5 / 100;
        double totalTagihan = dasarBiaya + asuransi;

        int jam   = jarak / 60;
        int menit = jarak % 60;


        System.out.println("\n=====================================");
        System.out.println("           LOGICALC - RINGKASAN        ");
        System.out.println("=======================================");
        System.out.println("Nama Klien   : " + namaKlien);
        System.out.println("Berat        : " + berat + " Kg");
        System.out.println("Jarak        : " + jarak + " Km");
        System.out.println("Jumlah Box   : " + jumlahBox + " Box");

        System.out.println("\n- Manajemen Armada -");
        System.out.println("Truk Penuh   : " + trukPenuh + " truk  (150 box)");
        System.out.println("Sisa Box     : " + sisaBox + " box   (dialihkan ke pikap)");

        System.out.println("\n- Kalkulasi Biaya -");
        System.out.println("Dasar Biaya  : Rp " + dasarBiaya);
        System.out.println("Asuransi 3.5%: Rp " + asuransi);
        System.out.println("Total Tagihan: Rp " + totalTagihan);

        System.out.println("\n- Estimasi Waktu Tiba -");
        System.out.println("Waktu Tempuh : " + jam + " jam " + menit + " menit");
        System.out.println("=======================================");
    }
}