/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kedaikopiferdi;

import com.mycompany.kedaikopiferdi.model.*;
import com.mycompany.kedaikopiferdi.payment.*;

/**
 * Main class - KedaiKopiFerdi
 * Berisi instantiation object dari seluruh class yang sudah dibuat.
 */
public class KedaiKopiFerdi {
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("  DAFTAR MENU KEDAI KOPI FERDI  ");
        System.out.println("==================================\n");

        // 1. Instantiation object Menu (Minuman, Makanan, Snack) 
        Minuman latte = new Minuman("M001", "Latte", 18000,
                "Perpaduan espresso bold dengan susu creamy yang lembut, menciptakan latte dengan rasa seimbang, smooth, dan bikin ingin kembali lagi.", 
                "Large", "Dingin");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Latte");
        System.out.println("Harga: Rp18.000");
        System.out.println("Ukuran: Large");
        System.out.println("Suhu: Dingin");
        System.out.println("-----------------------------");
        
        Minuman cappuccino = new Minuman("M002", "Cappuccino", 22000,
                "Espresso dengan foam susu lembut", "Normal", "Panas");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Cappuccino");
        System.out.println("Harga: Rp22.000");
        System.out.println("Ukuran: Normal");
        System.out.println("Suhu: Panas");
        System.out.println("-----------------------------");
        
        Minuman americano = new Minuman("M003", "Americano", 15000,
                "Espresso yang dipadukan dengan air panas, menghasilkan cita rasa kopi yang kuat dan khas.", "Large", "Dingin");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Americano");
        System.out.println("Harga: Rp15.000");
        System.out.println("Ukuran: Large");
        System.out.println("Suhu: Dingin");
        System.out.println("-----------------------------");
        
        Minuman butterscotch = new Minuman("M004", "Butterscotch", 25000,
                "perpaduan manis dan gurih dengan cita rasa karamel yang lembut, menghadirkan sensasi creamy dan aroma butter yang khas", 
                "Large", "Dingin");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Butterscotch");
        System.out.println("Harga: Rp25.000");
        System.out.println("Ukuran: Normal");
        System.out.println("Suhu: Dingin");
        System.out.println("-----------------------------");
        
        Makanan sandwich = new Makanan("F001", "Sandwich Telur", 20000,
                "Roti isi telur dan sayuran segar");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Sandwich Telur");
        System.out.println("Harga: Rp20.000");
        System.out.println("Deskripsi: Roti isi telur dan sayuran segar");
        System.out.println("--------------------------------------------");
        
        Makanan nasigorengayam = new Makanan("F002", "Nasi Goreng Ayam", 28000,
                "Nasi goreng gurih dengan bumbu khas, potongan ayam empuk, dan telur yang berpadu sempurna.");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Nasi Goreng Ayam");
        System.out.println("Harga: Rp28.000");
        System.out.println("Deskripsi: Nasi goreng gurih dengan bumbu khas, potongan ayam empuk, dan telur yang berpadu sempurna.");
        System.out.println("--------------------------------------------");
        
        Makanan nasibeefyakiniku = new Makanan("F003", "Nasi Beef Yakiniku", 33000,
                "Beef lembut, saus yakiniku yang manis-gurih, dan nasi hangat dalam satu porsi yang bikin susah berhenti makan.");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Nasi Beef Yakiniku");
        System.out.println("Harga: Rp33.000");
        System.out.println("Deskripsi: Beef lembut, saus yakiniku yang manis-gurih, dan nasi hangat dalam satu porsi yang bikin susah berhenti makan.");
        System.out.println("--------------------------------------------");
        
        Snack mixplatter = new Snack("S001", "Mix Platter", 35000,
                "Beragam camilan lezat dalam satu sajian! Perpaduan rasa gurih, renyah, dan nikmat yang pas untuk menemani waktu santai dan berbagi bersama orang terdekat.");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Mix Platter");
        System.out.println("Harga: Rp35.000");
        System.out.println("Deskripsi: Beragam camilan lezat dalam satu sajian! Perpaduan rasa gurih, renyah, dan nikmat yang pas untuk menemani waktu santai dan berbagi bersama orang terdekat.");
        System.out.println("--------------------------------------------");
        
        Snack cheesecake = new Snack("S002", "Cheese Cake", 28000,
                "Cheesecake lembut dan creamy dengan cita rasa keju yang gurih, manis yang pas, dan tekstur lumer di mulut.");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Cheese Cake");
        System.out.println("Harga: Rp28.000");
        System.out.println("Deskripsi: Cheesecake lembut dan creamy dengan cita rasa keju yang gurih, manis yang pas, dan tekstur lumer di mulut.");
        System.out.println("--------------------------------------------");
        
        Snack pisangGoreng = new Snack("S003", "Pisang Goreng Coklat", 15000,
                "Pisang goreng crispy dengan topping coklat");
        System.out.println("Menu berhasil ditambahkan:");
        System.out.println("Nama: Pisang Goreng Coklat");
        System.out.println("Harga: Rp15.000");
        System.out.println("Deskripsi: Pisang goreng crispy dengan topping coklat");
        
        System.out.println("\nTotal menu berhasil dibuat: 10 menu");
        System.out.println("------------------------------------------------------");

        // 2. Instantiation object Staff 
        System.out.println("===== DATA STAFF =====");

        Staff kasir1 = new Staff("ST001", "Mavelyne", "Pagi", "Kasir");
        System.out.println("Staff 1 berhasil ditambahkan");
        System.out.println("ID      : ST001");
        System.out.println("Nama    : Mavelyn");
        System.out.println("Shift   : Pagi");
        System.out.println("Jabatan : Kasir");
        System.out.println("------------------------------");
        
        Staff kasir2 = new Staff("ST002", "Mairyn", "Siang", "Kasir");
        System.out.println("Staff 2 berhasil ditambahkan");
        System.out.println("ID      : ST002");
        System.out.println("Nama    : Mairyn");
        System.out.println("Shift   : Siang");
        System.out.println("Jabatan : Kasir");
        
        Staff kasir3 = new Staff("ST003", "Charles", "Malam", "Barista");
        System.out.println("Staff 3 berhasil ditambahkan");
        System.out.println("ID      : ST003");
        System.out.println("Nama    : Charles");
        System.out.println("Shift   : Malam");
        System.out.println("Jabatan : Barista");
        
        Staff kasir4 = new Staff("ST004", "Paulina", "Pagi", "Barista");
        System.out.println("Staff 3 berhasil ditambahkan");
        System.out.println("ID      : ST004");
        System.out.println("Nama    : Paulina");
        System.out.println("Shift   : Pagi");
        System.out.println("Jabatan : Barista");
        
        Staff kasir5 = new Staff("ST005", "Olivette", "Siang", "Kasir");
        System.out.println("Staff 3 berhasil ditambahkan");
        System.out.println("ID      : ST005");
        System.out.println("Nama    : Olivette");
        System.out.println("Shift   : Siang");
        System.out.println("Jabatan : Kasir");
        
        System.out.println("\nTotal Staff Kasir: 5 staff");
        System.out.println("=================================");

        // 3. Instantiation object Pelanggan 
        System.out.println("===== DATA PELANGGAN =====");
        
        Pelanggan pelanggan1 = new Pelanggan("C001", "Ferdi", "ferdi7@gmail.com");
        System.out.println("Pelanggan berhasil terdaftar:");
        System.out.println("ID      : C001");
        System.out.println("Nama    : Ferdi");
        System.out.println("Email   : ferdi7@gmail.com");
        System.out.println("-----------------------------");
        
        Pelanggan pelanggan2 = new Pelanggan("C002", "Zavyn", "zavyn12@gmail.com");
        System.out.println("Pelanggan berhasil terdaftar:");
        System.out.println("ID      : C002");
        System.out.println("Nama    : Zavyn");
        System.out.println("Email   : zavyn12@gmail.com");
        
        Pelanggan pelanggan3 = new Pelanggan("C003", "Jezmavy", "jezm17@gmail.com");
        System.out.println("Pelanggan berhasil terdaftar:");
        System.out.println("ID      : C003");
        System.out.println("Nama    : Jezmavy");
        System.out.println("Email   : jezm17@gmail.com");
        
        Pelanggan pelanggan4 = new Pelanggan("C004", "Florinda", "florin19@gmail.com");
        System.out.println("Pelanggan berhasil terdaftar:");
        System.out.println("ID      : C004");
        System.out.println("Nama    : Florinda");
        System.out.println("Email   : florin17=9@gmail.com");
        
        Pelanggan pelanggan5 = new Pelanggan("C005", "Usman", "usman20@gmail.com");
        System.out.println("Pelanggan berhasil terdaftar:");
        System.out.println("ID      : C005");
        System.out.println("Nama    : Usman");
        System.out.println("Email   : usman20@gmail.com");
        
        System.out.println("\nTotal Pelanggan: 5 pelanggan");
        System.out.println("=================================");

        // 4. Staff membuatkan Pesanan baru untuk Pelanggan
        System.out.println("===== MEMBUAT PESANAN =====");
        
        System.out.println("Kasir           : Mavelyn");
        System.out.println("Nama            : Ferdi");
        System.out.println("ID Pesanan      : OR001");
        System.out.println("Tanggal Pesanan : 2026-07-27");
        
        Pesanan pesanan1 = kasir1.buatPesanan(
                "OR001", 
                "2026-07-27", 
                pelanggan1
        );
        
        System.out.println("\nPesanan OR001 Berhasil dibuat");
        System.out.println("Status Pesanan: Menunggu");
        System.out.println("---------------------------------");

        // 5. Instantiation object ItemPesanan lalu ditambahkan ke Pesanan 
        System.out.println("===== MENAMBAHKAN ITEM PESANAN =====");
        pesanan1.tambahItem(new ItemPesanan(latte, 2, "extra shot"));
        System.out.println(" 2x Kopi Susu Gula Aren ditambahkan");
        System.out.println(" Catatan: extra shot");
        
        pesanan1.tambahItem(new ItemPesanan(cappuccino, 1, "less sugar"));
        System.out.println(" 1x Capuccino ditambahkan");
        System.out.println(" Catatan: less sugar");
        
        pesanan1.tambahItem(new ItemPesanan(americano, 1, ""));
        System.out.println(" 1x Americano ditambahkan");
        
        pesanan1.tambahItem(new ItemPesanan(sandwich, 2, ""));
        System.out.println(" 2x Sandwich Telur ditambahkan");
        
        pesanan1.tambahItem(new ItemPesanan(pisangGoreng, 2, ""));
        System.out.println(" 2x Pisang Goreng Coklat ditambahkan");
        
        System.out.println("\nTotal jenis item: 5 item");
        System.out.println("Pesanan diproses");
        System.out.println("================================================");

        // Staff menerima pesanan
        System.out.println("\n===== KONFIRMASI PESANAN =====");
        
        System.out.println("Kasir Mavelyn menerima pesanan OR001...");
        kasir1.terimaPesanan(pesanan1);
        
        System.out.println("Pesanan berhasil diterima");
        System.out.println("=======================================");

        // Cetak detail pesanan sebelum bayar
        System.out.println();
        pesanan1.cetakDetail();

        // 6. Instantiation object Pembayaran (Polymorphism lewat Payable)
        System.out.println("\n===== PEMBAYARAN TUNAI =====");
        
        System.out.println("ID Pembayaran   : P001");
        System.out.println("Metode          : Tunai");
        System.out.println("Total Tagihan   : Rp" + pesanan1.hitungTotal());
        Payable pembayaran = new PembayaranTunai(
                "P001", 
                pesanan1, 
                100000
        );
        pembayaran.prosesPembayaran(pesanan1.hitungTotal());
        
        System.out.println("\nMencetak struk pembayaran...");
        pembayaran.cetakStruk();
        System.out.println("=======================================");

        // Staff mengonfirmasi pembayaran -> status pesanan berubah jadi "selesai"
        System.out.println("\n====== KONFIRMASI PEMBAYARAN =====");
        
        System.out.println("Kasir Mavelyn sedang mengonfirmasi pembayaran...");
        System.out.println();
        kasir1.konfirmasiPembayaran(pesanan1);
        
        System.out.println("Pembayaran berhasil.");
        System.out.println("Status pesanan telah diperbarui menjadi selesai.");
        System.out.println("===================================================");

        // 7. Contoh pesanan kedua dengan metode pembayaran QRIS 
        System.out.println("\n===== PESANAN KEDUA =====");
        
        System.out.println("Pelanggan       : Zavyn");
        System.out.println("ID Pelanggan    : OR002");
        System.out.println("Tanggal Pesanan : 2026-07-29");
        
        Pesanan pesanan2 = pelanggan2.buatPesanan(
                "OR002", 
                "2026-07-29"
        );
        
        System.out.println("\nPesanan kedua berhasil dibuat.");
        
        pesanan2.tambahItem(new ItemPesanan(cappuccino, 2, ""));
        
        System.out.println(" 2x Capuccino ditambahkan");
        pesanan2.cetakDetail();

        System.out.println();
        Payable pembayaran2 = new PembayaranQRIS(
                "P002", 
                pesanan2, 
                "QR162783"
        );
        
        System.out.println("ID Pembayaran   : P002");
        System.out.println("Metode          : QRIS");
        System.out.println("Kode QR         : QR162783");
        System.out.println("Total Tagihan   : Rp" + pesanan2.hitungTotal());
        
        pembayaran2.prosesPembayaran(pesanan2.hitungTotal());
        pembayaran2.cetakStruk();
        
        System.out.println("Pembayaran Berhasil.");
        System.out.println("==================================");

        // 8. Lihat riwayat pesanan pelanggan 
        System.out.println("\n===== RIWAYAT PESANAN PELANGGAN =====");
        
        pelanggan1.lihatRiwayat();
        pelanggan2.lihatRiwayat();
        
        System.out.println("\n------------------------------------");
        System.out.println("    TERIMA KASIH TELAH BERKUNJUNG");
        System.out.println("          KEDAI KOPI FERDI");
        System.out.println("\n");
        
        // 9. Simulasi Encapsulation: Getter, Setter Valid & Invalid 
        // Panggil getter -> tampilkan data awal pelanggan
        System.out.println("Email awal pelanggan: " + pelanggan1.getEmail());

        // Simulasi setter dengan data VALID
        pelanggan1.setEmail("ferdi7@email.com");
        System.out.println("Email setelah diubah (valid): " + pelanggan1.getEmail());

        // Simulasi setter dengan data TIDAK VALID
        pelanggan2.setEmail("Zavyn format email tidak valid");
        System.out.println("Email setelah percobaan invalid (harusnya tetap yg lama): " + pelanggan2.getEmail());

        // Simulasi validasi harga (Menambahkan validasi di Menu.java)
        System.out.println("\nMengubah harga menu dengan data valid");
        latte.setHarga(18000);
        System.out.println("Harga setelah diubah (valid): Rp" + latte.getHarga());
        cappuccino.setHarga(22000);
        System.out.println("Harga setelah diubah (valid): Rp" + cappuccino.getHarga());

        System.out.println("\nMengubah harga menu dengan data tidak valid");
        latte.setHarga(-5000);
        System.out.println("Harga setelah percobaan invalid: Rp" + latte.getHarga());
    }
}
