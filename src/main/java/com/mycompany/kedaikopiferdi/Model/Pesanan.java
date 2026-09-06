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
 * Class Pesanan (Order)
 */
public class Pesanan {

    // Field 
    private String idPesanan;
    private String tanggal;
    private Pelanggan pelanggan;
    private List<ItemPesanan> daftarItemPesanan;
    private String status; // diproses / selesai / diambil

    // Constructor 
    public Pesanan(String idPesanan, String tanggal, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.tanggal = tanggal;
        this.pelanggan = pelanggan;
        this.daftarItemPesanan = new ArrayList<>();
        this.status = "diproses";
    }

    // Getter & Setter 
    public String getIdPesanan() {
        return idPesanan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public List<ItemPesanan> getDaftarItemPesanan() {
        return daftarItemPesanan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method
    public void tambahItem(ItemPesanan item) {
        daftarItemPesanan.add(item);
    }

    public void hapusItem(ItemPesanan item) {
        daftarItemPesanan.remove(item);
    }

    /**
     * Menghitung total harga seluruh item dalam pesanan.
     */
    public double hitungTotal() {
        double total = 0;
        for (ItemPesanan item : daftarItemPesanan) {
            total += item.subtotal();
        }
        return total;
    }

    public void updateStatus(String statusBaru) {
        this.status = statusBaru;
        System.out.println("Status pesanan " + idPesanan + " diubah menjadi: " + statusBaru);
    }

    public void cetakDetail() {
        System.out.println("=== Detail Pesanan " + idPesanan + " ===");
        System.out.println("Pelanggan : " + pelanggan.getNama());
        System.out.println("Tanggal   : " + tanggal);
        for (ItemPesanan item : daftarItemPesanan) {
            System.out.println("- " + item);
        }
        System.out.println("Total     : Rp" + hitungTotal());
        System.out.println("Status    : " + status);
    }
}
