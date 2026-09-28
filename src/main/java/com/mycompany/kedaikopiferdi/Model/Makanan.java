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
 * Class Makanan merupakan turunan (inheritance) dari class Menu.
 * Konsep OOP: Inheritance & Polymorphism
 */

public class Makanan extends Menu {

    public Makanan(String idMenu, String namaMenu, double harga, String deskripsi) {
        // memanggil constructor parent class (Menu)
        super(idMenu, namaMenu, harga, "Makanan", deskripsi);
    }

    /**
     * Override method hitungHarga() dari class Menu.
     * Harga makanan tetap, tidak ada tambahan ukuran.
     * @return harga makanan
     */
    @Override
    public double hitungHarga() {
        return getHarga();
    }
    
    /**
     * Override method getInfo() dari class Menu.
     * Menambahkan keterangan bahwa menu merupakan makanan berat.
     * @return informasi makanan
     */
    @Override
    public String getInfo() {
        return super.getInfo() + " (Makanan Berat)";
    }
}
