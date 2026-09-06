/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kedaikopiferdi.model;

/**
 *
 * @author ASUS
 */
public abstract class Menu {

    // Field 
    private String idMenu;
    private String namaMenu;
    private double harga;
    private String kategori;
    private String deskripsi;

    // Constructor 
    public Menu(String idMenu, String namaMenu, double harga, String kategori, String deskripsi) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
    }

    // Getter & Setter 
    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Method
    public String getInfo() {
        return "[" + kategori + "] " + namaMenu + " - Rp" + harga;
    }

    
    public abstract double hitungHarga();
}
