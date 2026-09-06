/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kedaikopiferdi.model;

/**
 *
 * @author ASUS
 */
public class ItemPesanan {
    // Field 
    private Menu menu;
    private int jumlah;
    private String catatan; // contoh catatan: "less sugar", "extra shot"

    // Constructor 
    public ItemPesanan(Menu menu, int jumlah, String catatan) {
        this.menu = menu;
        this.jumlah = jumlah;
        this.catatan = catatan;
    }

    // Getter & Setter 
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    // Method

    /**
     * Menghitung subtotal item ini.
     * Memanfaatkan polymorphism: menu.hitungHarga() akan memanggil
     * implementasi hitungHarga() sesuai jenis menu (Minuman/Makanan/Snack).
     * @return 
     */
    public double subtotal() {
        return menu.hitungHarga() * jumlah;
    }

    @Override
    public String toString() {
        return jumlah + "x " + menu.getNamaMenu()
                + (catatan != null && !catatan.isEmpty() ? " (" + catatan + ")" : "")
                + " = Rp" + subtotal();
    }
}
