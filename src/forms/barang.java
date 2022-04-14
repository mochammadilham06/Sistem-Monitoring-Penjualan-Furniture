package forms;

public class barang {

    private String namaBarang;
    private String barang;
    
    private int kodeBarang;
    private int kodeSatuan;
    private int stokMinimal;

    private double hargaBeli;
    private double hargaJual;

    public barang(int kodeBarang, String namaBarang, String barang, 
            int stokMinimal, double hargaBeli, double hargaJual)
    {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kodeSatuan = kodeSatuan;
        this.stokMinimal = stokMinimal;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;  
        this.barang = barang;
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
    
    public int getKodeSatuan(){
        return kodeSatuan;
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
    
    
}
