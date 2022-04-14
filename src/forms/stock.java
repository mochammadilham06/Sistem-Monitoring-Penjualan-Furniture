/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.Date;

public class stock {
    
private int id_barang;
private Date tanggal;
private int jumlah;
private int id_pengguna;
private String nama_barang;
private int stok_minimal;
private String nama_lengkap;

    public stock(String nama_barang, int jumlah, Date tanggal,int stok_minimal, String nama_lengkap){
    this.id_barang = id_barang;
    this.tanggal = tanggal;
    this.jumlah = jumlah;
    this.id_pengguna = id_pengguna;
    this.nama_barang=nama_barang;
    this.stok_minimal=stok_minimal;
    this.nama_lengkap = nama_lengkap;
    }
    
    public int getIdBarang(){
    return id_barang;
    }
    public String getNamaBarang(){
    return nama_barang;
    }
    public String getNamaLengkap(){
    return nama_lengkap;
    }
    public Date getTanggal(){
    return tanggal;
    }
    public int getJumlah(){
    return jumlah;
    }
    public int getStokMinimal(){
    return stok_minimal;
    }
    public int getIdPengguna(){
    return id_barang;
    }

}
