/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kedaikopiferdi.model;

/**
 *
 * @author ASUS
 */
public class Makanan extends Menu {

    public Makanan(String idMenu, String namaMenu, double harga, String deskripsi) {
        // memanggil constructor parent class (Menu)
        super(idMenu, namaMenu, harga, "Makanan", deskripsi);
    }

    /**
     * Override method hitungHarga() dari class Menu.
     * Harga makanan tetap, tidak ada tambahan ukuran.
     * @return 
     */
    @Override
    public double hitungHarga() {
        return getHarga();
    }
}
