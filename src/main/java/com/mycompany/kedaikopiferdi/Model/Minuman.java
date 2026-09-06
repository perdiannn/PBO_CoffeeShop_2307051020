/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kedaikopiferdi.model;

/**
 *
 * @author ASUS
 */
public class Minuman extends Menu {

    // Field 
    private String ukuran; // Normal / Large / ExtraLarge
    private String suhu;   // Panas / Dingin

    // Constructor 
    public Minuman(String idMenu, String namaMenu, double harga, String deskripsi,
                    String ukuran, String suhu) {
        // memanggil constructor parent class (Menu)
        super(idMenu, namaMenu, harga, "Minuman", deskripsi);
        this.ukuran = ukuran;
        this.suhu = suhu;
    }

    // Getter & Setter 
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getSuhu() {
        return suhu;
    }

    public void setSuhu(String suhu) {
        this.suhu = suhu;
    }

    /**
     * Override method hitungHarga() dari class Menu.
     * Harga bertambah sesuai ukuran gelas.
     * @return 
     */
    @Override
    public double hitungHarga() {
        double tambahan = 0;
        switch (ukuran) {
            case "Large":
                tambahan = 3000;
                break;
            case "ExtraLarge":
                tambahan = 6000;
                break;
            default: // Normal
                tambahan = 0;
        }
        return getHarga() + tambahan;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " (" + ukuran + ", " + suhu + ")";
    }
}
