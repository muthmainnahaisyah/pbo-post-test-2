package travel;

import java.util.ArrayList;

public final class manajemen_tiket {
    private static final ArrayList<tiket> tikets = new ArrayList<>();
    
    public static void TambahTiket(tiket ticket){
        tikets.add(ticket);
    }
    
    public static void TampilkanDaftarTiket(){
        for (tiket ticket : tikets){
            ticket.TampilkanTiket();
            System.out.println();
        }
    }
    
    public static void PerbaharuiDaftarTiket(int id, tiket ticket){
        for (int i = 0; i < tikets.size(); i++){
            if (tikets.get(i).getId() == id){
                tikets.set(i, ticket);
                break;
            }
        }
    }
    
    public static void HapusDaftarTiket(int id){
        for (int i = 0; i < tikets.size(); i++){
            if(tikets.get(i).getId() == id){
                tikets.remove(i);
                break;
            }
        }
    }
    
    public static boolean getTiket(int id){
        for (tiket ticket : tikets){
            if (ticket.getId() == id){
                return true;
            }
        }
        return false;
    }  
}
