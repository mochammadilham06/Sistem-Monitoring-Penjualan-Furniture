/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.Date;


public class controlBarang {
    private String namaBarang;
    private String barang;
    
    private int kodeBarang;
    private int kodeSatuan;
    private int stokMinimal;

    private double hargaBeli;
    private double hargaJual;
    
    private Date tanggal;
    
    public controlBarang(int kodeBarang, String namaBarang, String barang, int stokMinimal, Date tanggal, double hargaBeli, double hargaJual){
    this.hargaBeli = hargaBeli;
    this.barang = barang;
    this.hargaJual = hargaJual;
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.stokMinimal = stokMinimal;
    this.tanggal = tanggal;
    }
    
    public int getKodeBarang(){
        return kodeBarang;
    }
    
    public String getNamaBarang(){
        return namaBarang;
    }
    
    public String getSatuan(){
    return barang;
    }
    
    public String getJenis(){
        return barang;
    }
    
    public int getstokMinimal(){
        return stokMinimal;
    }
    
    public double getHargaBeli(){
        return hargaBeli;
    }
    
    public double getHargaJual(){
        return hargaJual;
    }
    
    public Date getTanggal(){
    return tanggal;
    }
    
}
