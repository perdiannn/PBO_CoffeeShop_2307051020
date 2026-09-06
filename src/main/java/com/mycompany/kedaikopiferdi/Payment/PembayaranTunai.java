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

/**
 * Class PembayaranTunai (Cash)
 */
public class PembayaranTunai extends Pembayaran {

    private double uangDiterima;

    public PembayaranTunai(String idPembayaran, Pesanan pesanan, double uangDiterima) {
        super(idPembayaran, pesanan, "Tunai");
        this.uangDiterima = uangDiterima;
    }

    /**
     * Override sesuai kebutuhan metode tunai: cek kecukupan uang & hitung kembalian.
     */
    @Override
    public boolean prosesPembayaran(double jumlahBayar) {
        if (uangDiterima >= jumlahBayar) {
            double kembalian = uangDiterima - jumlahBayar;
            System.out.println("Pembayaran tunai berhasil. Kembalian: Rp" + kembalian);
            return true;
        } else {
            System.out.println("Uang tidak cukup!");
            return false;
        }
    }
}
