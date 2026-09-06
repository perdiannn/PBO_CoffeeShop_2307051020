/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kedaikopiferdi.payment;

/**
 *
 * @author ASUS
 */
/*
 * Interface Payable
 * Kontrak untuk semua objek yang bisa diproses pembayarannya.
 */
public interface Payable {
    boolean prosesPembayaran(double jumlahBayar);
    void cetakStruk();
}
