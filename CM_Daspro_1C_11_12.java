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
    static void tambahStock (){
        System.out.println("\n===== TAMBAH STOK =====");

        System.out.print("Masukkan nomor item: ");
        int inputNomor1112 = madeIn1112.nextInt();
        int nmrbarang1112 = inputNomor1112 - 1;
        if (nmrbarang1112 >= 0 && nmrbarang1112 < nomor1112 ) {
            System.out.print("Masukkan jumlah stok yang ingin di tambahkan: ");
            int inputStok1112 = madeIn1112.nextInt();
            int tambahStok = inputStok1112;
            if (tambahStok > 0) {
                stokBarang1112[nmrbarang1112] += tambahStok;
                System.out.println("Stok Berhasil ditambahkan. Stok Sekarang: " + stokBarang1112[nmrbarang1112]);
            }else{
                System.out.println("Jumlah stok harus lebih dari 0");
            }
        }else{
            System.out.println("Nomor item tidak valid");
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
            System.out.println("\n===== MENU INVENTORI CAFE =====");
            System.out.println("1. Tampilkan Inventori");
            System.out.println("2. Tambah Stok untuk item yang ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            int menu1112 = madeIn1112.nextInt();
            if (menu1112 == 1) {
                tampilkanInventori();
            }if (menu1112 == 2) {
                tambahStock();
            }if (menu1112 == 3) {

            }
        }
    }

}