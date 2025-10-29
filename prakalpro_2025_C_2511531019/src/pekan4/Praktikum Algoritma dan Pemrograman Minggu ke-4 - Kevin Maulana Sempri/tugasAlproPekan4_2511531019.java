package TugasdanPraktikumKampus;
import java.util.Scanner;
public class tugasAlproPekan4_2511531019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data
        System.out.print("Masukkan nama pengirim: ");
        String namaPengirim = input.nextLine();
        
        System.out.print("Masukkan berat paket (kg): ");
        double beratPaket = input.nextDouble();
        
        System.out.print("Masukkan jarak pengiriman (km): ");
        int jarakPengiriman = input.nextInt();
        
        System.out.println("\nJenis Layanan:");
        System.out.println("1. Reguler");
        System.out.println("2. Express");
        System.out.println("3. Same Day");
        System.out.print("Pilih jenis layanan (1-3): ");
        int jenisLayanan = input.nextInt();
        
        System.out.println("\nJenis Paket:");
        System.out.println("1. Dokumen");
        System.out.println("2. Barang Biasa");
        System.out.println("3. Barang Elektronik");
        System.out.print("Pilih jenis paket (1-3): ");
        int jenisPaket = input.nextInt();
        
        // Perhitungan biaya dasar (Rp 5000 per kg)
        double biayaDasar = beratPaket * 5000;
        
        // Perhitungan biaya jarak (Rp 2000 per 5 km)
        double biayaJarak = Math.ceil(jarakPengiriman / 5.0) * 2000;
        
        double subtotal = biayaDasar + biayaJarak;
        
        double persenLayanan = 0;
        String namaLayanan = "";
        if (jenisLayanan == 1) {
            persenLayanan = 25;
            namaLayanan = "Reguler";
        } else if (jenisLayanan == 2) {
            persenLayanan = 50;
            namaLayanan = "Express";
        } else if (jenisLayanan == 3) {
            persenLayanan = 100;
            namaLayanan = "Same Day";
        }
        double biayaLayanan = subtotal * persenLayanan / 100;
        
        double biayaJenisPaket = 0;
        String namaPaket = "";
        if (jenisPaket == 1) {
            biayaJenisPaket = 2500;
            namaPaket = "Dokumen";
        } else if (jenisPaket == 2) {
            biayaJenisPaket = 5000;
            namaPaket = "Barang Biasa";
        } else if (jenisPaket == 3) {
            biayaJenisPaket = 10000;
            namaPaket = "Barang Elektronik";
        }
        
        double totalSebelumDiskon = subtotal + biayaLayanan + biayaJenisPaket;
        
        double diskon = 0;
        if (beratPaket > 10) {
            diskon = totalSebelumDiskon * 0.1;
        }
        
        double totalBiaya = totalSebelumDiskon - diskon;
        
        System.out.println("\n===== BIAYA PENGIRIMAN PAKET =====");
        System.out.printf("Nama Pengirim        : %s\n", namaPengirim);
        System.out.printf("Berat Paket          : %.1f kg\n", beratPaket);
        System.out.printf("Jarak Pengiriman     : %d km\n", jarakPengiriman);
        System.out.printf("Jenis Layanan        : %s\n", namaLayanan);
        System.out.printf("Jenis Paket          : %s\n", namaPaket);
        System.out.println("--------------------------------------");
        System.out.printf("Biaya Dasar          : Rp %.0f\n", biayaDasar);
        System.out.printf("Biaya Jarak          : Rp %.0f\n", biayaJarak);
        System.out.printf("Subtotal             : Rp %.0f\n", subtotal);
        System.out.printf("Biaya Layanan (%.0f%%)  : Rp %.0f\n", persenLayanan, biayaLayanan);
        System.out.printf("Biaya Jenis Paket    : Rp %.0f\n", biayaJenisPaket);
        System.out.printf("Total Sebelum Diskon : Rp %.0f\n", totalSebelumDiskon);
        System.out.printf("Diskon               : Rp %.0f\n", diskon);
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL BIAYA          : Rp %.0f\n", totalBiaya);
        
        input.close();
    }
}