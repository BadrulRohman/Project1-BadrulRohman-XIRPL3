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
public class Pesanan {
    
    private Menu menu;
    private int jumlah;
    private String keterangan;
    
   public Pesanan(Menu menu, int jumlah) {
       
       this.menu = menu;
       this.jumlah = jumlah; 
   }
    public Menu getMenu() {
        return menu;
        
    }

    public int getJumlah() {
        return jumlah;
       
    }
    
    public void setJumlah(){
        
    }

    public void setKeterangan(String Keterangan){
        this.keterangan = keterangan;
    }
    
    public String getketerangan(){
        return keterangan;
    }
}
