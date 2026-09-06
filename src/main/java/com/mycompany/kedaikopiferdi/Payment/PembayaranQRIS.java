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
 * Class PembayaranQRIS
 */
public class PembayaranQRIS extends Pembayaran {

    private String kodeReferensi;

    public PembayaranQRIS(String idPembayaran, Pesanan pesanan, String kodeReferensi) {
        super(idPembayaran, pesanan, "QRIS");
        this.kodeReferensi = kodeReferensi;
    }

    /**
     * Override sesuai kebutuhan metode QRIS: simulasi verifikasi kode referensi.
     */
    @Override
    public boolean prosesPembayaran(double jumlahBayar) {
        System.out.println("Memverifikasi pembayaran QRIS dengan referensi: " + kodeReferensi);
        System.out.println("Pembayaran QRIS berhasil sebesar Rp" + jumlahBayar);
        return true;
    }
}
