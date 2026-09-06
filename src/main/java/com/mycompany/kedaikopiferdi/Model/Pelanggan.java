/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kedaikopiferdi.model;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;
/*
 * Class Pelanggan (Customer)
 */
public class Pelanggan {

    // Field
    private String idPelanggan;
    private String nama;
    private String email;
    private List<Pesanan> riwayatPesanan;

    // Constructor
    public Pelanggan(String idPelanggan, String nama, String email) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.riwayatPesanan = new ArrayList<>();
    }

    // Getter & Setter 
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method 

    /**
     * Membuat pesanan baru untuk pelanggan.
     * Object Pesanan dibuat (instantiation) lalu dimasukkan ke riwayat.
     */
    public Pesanan buatPesanan(String idPesanan, String tanggal) {
        Pesanan pesananBaru = new Pesanan(idPesanan, tanggal, this);
        riwayatPesanan.add(pesananBaru);
        return pesananBaru;
    }

    public void lihatRiwayat() {
        System.out.println("=== Riwayat Pesanan " + nama + " ===");
        if (riwayatPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }
        for (Pesanan p : riwayatPesanan) {
            System.out.println(p.getIdPesanan() + " | " + p.getTanggal()
                    + " | Status: " + p.getStatus()
                    + " | Total: Rp" + p.hitungTotal());
        }
    }
}
