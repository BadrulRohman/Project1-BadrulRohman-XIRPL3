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
    private double biayaService;
    
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
    
    public double hitungTotalPesanan () {
        for (int i =0; i < pesanan.size(); i++) {
          Pesanan psn = pesanan.get(i);
          double harga = psn.getMenu().getHarga();
          totalBayar += (harga * psn.getJumlah());
        }
        return totalBayar;
    }
    
    public double hitungPajak(){
        return totalBayar * pajak;
    }
    public double hitungBiayaService(){
        return totalBayar * biayaService;
    }
    
    public double hitungTotalBayar (double pajak, double service){
        totalBayar = totalBayar + pajak + service;
        return totalBayar;
    }
    
    public double hitungKembalian (double uang_bayar){
            return uang_bayar - totalBayar; 
    }
    
    
    
    public double hitungKembalian() {return 0;}
    
    public void cetakStruk () {  
        System.out.println("\n========= ALDEBARAMEN =======");
        System.out.println("No Transaksi  :" + noTransaksi);
        System.out.println("Pemesan  :" + namaPemesan);
        System.out.println("Tanggal  :" + Tanggal);
        
        // cek jika nomor meja kososng berarti take awway
        
        if(noMeja.equals("")){
            noMeja = "Take Away";
        } 
        
        System.out.println("Meja : "+ noMeja);
                System.out.println("=========");
                
          for (int i =0; i < pesanan.size(); i++) {
            Pesanan psn  = pesanan.get(i);
            Menu m = psn.getMenu();
        String pesanan = psn.getJumlah() + " " + m.getNama_menu() + "\t" 
                + (m.getHarga() * psn.getJumlah());
          
          
          if ( m.getKategori().equals("Kuah")){
              pesanan = " " + pesanan;
              
          }
          System.out.println(pesanan);
          }
          
            
     }
    
       //tambahkan
    
    public void setPajak (double pajak){
        this.pajak = pajak;
    }
                public void setBIayaService (double service){
                    this.biayaService = service;
                }
                                
  }
    
    
    

