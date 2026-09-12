/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kedaikopiferdi.model;

/**
 *
 * @author ASUS
 */
/*
 * Class Staff (Kasir/Barista)
 */
public class Staff {

    // ===== Field =====
    private String idStaff;
    private String nama;
    private String shift; // Pagi / Siang / Malam
    private String role;  // Kasir / Barista

    // ===== Constructor =====
    public Staff(String idStaff, String nama, String shift, String role) {
        this.idStaff = idStaff;
        this.nama = nama;
        this.shift = shift;
        this.role = role;
    }

    // ===== Getter & Setter =====
    public String getIdStaff() {
        return idStaff;
    }

    public String getNama() {
        return nama;
    }

    public String getShift() {
        return shift;
    }

    public String getRole() {
        return role;
    }

    // ===== Method =====
    public void terimaPesanan(Pesanan pesanan) {
        System.out.println(nama + " (" + role + ") menerima pesanan " + pesanan.getIdPesanan());
    }

    public Pesanan buatPesanan(String idPesanan, String tanggal, Pelanggan pelanggan) {
        System.out.println(nama + " membuatkan pesanan baru untuk " + pelanggan.getNama());
        return pelanggan.buatPesanan(idPesanan, tanggal);
    }

    public void konfirmasiPembayaran(Pesanan pesanan) {
        pesanan.updateStatus("selesai");
        System.out.println(nama + " mengonfirmasi pembayaran pesanan " + pesanan.getIdPesanan());
    }
    
    // hanya bisa diakses oleh class lain yang ada dalam package yang sama (model)
    void logAktivitas(String aktivitas) {
        System.out.println("[LOG[ " + nama + ": " + aktivitas);
    }
}
