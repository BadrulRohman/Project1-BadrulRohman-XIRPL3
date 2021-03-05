/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class DaftarMenu {
    
    private ArrayList<Menu> daftarMenu;
    
    public DaftarMenu () {
    daftarMenu = new ArrayList <> () ;
    }
    public void tambahMenu (Menu menu) {
    daftarMenu.add(menu);
    }
    public void getMenuByKategori (String kategori) {
        System.out.println("======" + kategori + "=====");
        
        for (int i = 0; i<daftarMenu.size(); i++) {
            Menu m =daftarMenu.get(i);
            if (m.getKategori().equals(kategori)) {
                   System.out.println((i + 1) + "." + m.getNama_menu() + "\t" + m.getHarga());
            }
        }
    }
    public void tampilDaftarMenu() {
        System.out.println("===== ALDERBAIN ====");
       getMenuByKategori("Ramen");
       getMenuByKategori("Kuah");
       getMenuByKategori("Toping");
       getMenuByKategori("Minuman");
    }

    //tambah method
    public Menu pilihMenu() {
       try {
        Scanner input = new Scanner (System.in);
           System.out.print("Nomor Menu yang dipesan : ");
    int no_menu = input.nextInt();
    
//get menu berdasarkan no_menu, di -1 karena arrayList mulai dari0
Menu m = daftarMenu.get(no_menu-1) ;
//cek apakah menu kuah?
if (!m.getKategori().equalsIgnoreCase ("Kuah ")) {
     return m;
}else {
    
    //jika yang dipilih adal ah menu kuah, maka tidak bisa, user harus memilih lagi
    System.out.println (" [Err] Pesan dulu Menu Ramen") ;
    return pilihMenu ();
    }
    
       }catch(IndexOutOfBoundsException err){
           
           System.out.println("[Err] Pesan dulu menu ramen");
           return pilihMenu();
    }catch(InputMismatchException err) {
    
    System.out.println("[Err] Mohon masukkan nomor kuah");
    return pilihMenu();}
    
}
       
    

    public Menu pilihKuah(){
        try {
            Scanner input = new Scanner(System.in);
                    
            System.out.print("kuah [sesuai nomor menu] : ");
            int no_menu = input.nextInt();
            // get menu berdasarkan ni_menu di -1 karena arralisty mulai dai 0
            Menu m = daftarMenu.get (no_menu -1);
            
            //apakah menu kuah?/
            
            if(m.getKategori().equalsIgnoreCase("Kuah")){
                return m;
            }else{
                System.out.println("[Err] Pesanan Tidak Tersedia");
                
                // jika tidak ada, maka user akan diminata untuk mengulang memasukkan nomor menu 
                // teknik ini disebur
                
                return pilihKuah();
            }
                
        }catch (IndexOutOfBoundsException err){
                    // jik input bukan berupa angak makak akan disuruh memasnk=ukan angka
                    
                   System.out.println("[Err] Mohon Masukkan Nomor Kuah");
                   return pilihKuah();
       }catch(InputMismatchException err){
           
           System.out.println("[Err] Mohon masukkan nomor kuah");
        return pilihKuah(); 
       }
       
    } 
}