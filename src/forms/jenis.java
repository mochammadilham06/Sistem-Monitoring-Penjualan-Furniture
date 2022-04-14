/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

public class jenis {
    private String satuan;
    private String keterangan;
    private int kode_satuan;
    
    public jenis(String satuan, String keterangan, int kode_satuan){
    
        this.satuan = satuan;
        this.keterangan = keterangan;
        this.kode_satuan = kode_satuan;
    }
    
    public String getSatuan(){
        return satuan;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public int getKodeSatuan(){
    return kode_satuan;
    }
    
}
     