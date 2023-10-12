package travel;

public abstract class tiket {
    private final int id;
    private final String nama_penumpang;
    private final String destinasi;
    
    public tiket(int id, String nama_penumpang, String destinasi){
        this.id = id;
        this.nama_penumpang = nama_penumpang;
        this.destinasi = destinasi;
    }
    
    public final int getId(){
        return id;
    }
    
    public final String getNamaPenumpang(){
        return nama_penumpang;
    }
    
    public final String getDestinasi(){
        return destinasi;
    }
    
    public abstract void TampilkanTiket();
}
