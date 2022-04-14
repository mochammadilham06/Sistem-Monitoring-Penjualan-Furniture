/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;


public class pengguna {
    private String nama;
    private int kode_pengguna;
    private String alamat;
    private String nomor;
   
    public pengguna (String nama, String alamat, String nomor){
    this.alamat = alamat;
    this.nama = nama;
    this.nomor = nomor;
    }
    public int getKode(){
    return kode_pengguna;
    }
    public String getAlamat(){
    return alamat;
    }
    public String getNama(){
    return nama;
    }
    public String getNomor(){
    return nomor;
    }
}
