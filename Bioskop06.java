import java.util.Scanner;
/**
 * Bioskop06
 */
public class Bioskop06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlah;
        int totalTiket=0;
        double totalPenjualan=0;

        do {
            System.out.print("Jumlah tiket (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi!");
                continue;
            }
            double bayar = jumlah * hargaTiket;
            if (jumlah > 10 ) {
                bayar = bayar * 0.85;
            } else if (jumlah > 4) {
                bayar = bayar * 0.90;
            }
            totalTiket += jumlah;
            totalPenjualan += bayar;
            if (jumlah > 0) {
                System.out.println("Bayar: Rp" + bayar);
            }
        } while (jumlah != 0);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);
    }
}