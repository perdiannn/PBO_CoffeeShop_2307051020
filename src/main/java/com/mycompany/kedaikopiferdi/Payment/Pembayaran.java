/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kedaikopiferdi.payment;

/**
 *
 * @author ASUS
 */
import com.mycompany.kedaikopiferdi.model.Pesanan;

/*
 * Abstract class Pembayaran
 */
public abstract class Pembayaran implements Payable {

    // Field 
    private String idPembayaran;
    private Pesanan pesanan;
    private double totalBayar;
    private String metode;

    // Constructor
    public Pembayaran(String idPembayaran, Pesanan pesanan, String metode) {
        this.idPembayaran = idPembayaran;
        this.pesanan = pesanan;
        this.totalBayar = pesanan.hitungTotal();
        this.metode = metode;
    }

    // Getter
    public String getIdPembayaran() {
        return idPembayaran;
    }

    public Pesanan getPesanan() {
        return pesanan;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public String getMetode() {
        return metode;
    }

    // Method umum 
    @Override
    public void cetakStruk() {
        System.out.println("=== STRUK PEMBAYARAN ===");
        System.out.println("ID Pembayaran : " + idPembayaran);
        System.out.println("ID Pesanan    : " + pesanan.getIdPesanan());
        System.out.println("Metode        : " + metode);
        System.out.println("Total Bayar   : Rp" + totalBayar);
    }

    // prosesPembayaran() sengaja tidak diimplementasikan di sini,
    // karena setiap metode pembayaran punya proses yang berbeda (Polymorphism)
}
