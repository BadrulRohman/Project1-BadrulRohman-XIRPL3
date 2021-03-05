/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Asus-X441S
 */
import java.util.ArrayList;
public class Transaksi {
    
    private String noTransaksi;
    private String namaPemesan;
    private String Tanggal;
    private String noMeja;
    private ArrayList<Pesanan> pesanan;
    private double uangBayar;
    private double pajak;
    private double totalBayar;
    
    public Transaksi (String no_transaksi, String nm_pemesan, String tanggal, String no_meja) { 
    this.noTransaksi = no_transaksi;
    this.namaPemesan = nm_pemesan;
    this.Tanggal = tanggal;
    this.noMeja = no_meja;
    
    pesanan = new ArrayList <>();
    }
    
    public void tambahPesanan (Pesanan pesanan) { 
    this.pesanan.add(pesanan);
    }
    
    public ArrayList<Pesanan> getSemuaPesanan() {
        return pesanan;}
    
    public double hitungTotalBayar () {
        for {int i =0; i<pesanann.size(); i++) {
            Pesanan psn + pesanan.get(i);
            double harga - psn.getMenu().getHarga();
            totalBayar += (harga * psn.getJumlah());
        }
        return TotalBayar;}
    
    public double hitungKembalian() {return 0;}
    
    public void cetakStruk () {  }
    
    
    
}
