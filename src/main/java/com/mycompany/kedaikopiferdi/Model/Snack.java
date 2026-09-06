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
 * Class Snack merupakan turunan (inheritance) dari class Menu.
 */
public class Snack extends Menu {

    public Snack(String idMenu, String namaMenu, double harga, String deskripsi) {
        super(idMenu, namaMenu, harga, "Snack", deskripsi);
    }

    /**
     * Override method hitungHarga() dari class Menu.
     * Harga snack tetap, tidak ada tambahan ukuran.
     */
    @Override
    public double hitungHarga() {
        return getHarga();
    }
}
