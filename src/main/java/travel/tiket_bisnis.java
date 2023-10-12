package travel;

public class tiket_bisnis extends tiket {
    private final int harga;
    
    public tiket_bisnis(int id, String nama_penumpang, String destinasi, int harga){
        super(id, nama_penumpang, destinasi);
        this.harga = harga;
    }
    
    public final int getHarga(){
        return harga;
    }
    
    @Override
    public void TampilkanTiket(){
        System.out.println("==============================");
        System.out.println("ID Penerbangan: " + getId());
        System.out.println("Nama Penumpang: " + getNamaPenumpang());
        System.out.println("Destinasi Tujuan: " + getDestinasi());
        System.out.println("Total Harga: " + getHarga());
    }
}
