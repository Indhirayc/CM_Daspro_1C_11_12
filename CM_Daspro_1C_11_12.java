import java.util.Scanner;

public class CM_Daspro_1C_11_12 {
    static Scanner madeIn1112 = new Scanner(System.in);
    static String [] namaBarang1112 = new String[10];
    static String[] kategori1112 = new String[10];
    static int[] stokBarang1112 = new int[10];
    static int nomor1112 = 0;

    static void tampilkanInventori() {
        System.out.println("\n===== DATA INVENTORI KAFE =====");
        System.out.println("No  \tNama Item \tKategori  \tStok");
        for (int i = 0; i < nomor1112; i++) {
            System.out.println((i + 1) + "\t" + namaBarang1112[i] + "\t" + kategori1112[i] + "\t" + "\t" + stokBarang1112[i]);
        }
    }

    public static void main(String[] args) {
        namaBarang1112[0] = "Kopi Hitam";
        kategori1112[0] = "Minuman";
        stokBarang1112[0] = 10;
        nomor1112++;

        namaBarang1112[1] = "Cappuccino";
        kategori1112[1] = "Minuman";
        stokBarang1112[1] = 5;
        nomor1112++;

        namaBarang1112[2] = "Teh Tarik";
        kategori1112[2] = "Minuman";
        stokBarang1112[2] = 8;
        nomor1112++;

        while (true) {
            System.out.println("===== MENU INVENTORI CAFE =====");
            System.out.println("1. Tampilkan Inventori");
            System.out.println("2. Tambah Stok untuk item yang ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = madeIn1112.nextInt();
        }
    }

}