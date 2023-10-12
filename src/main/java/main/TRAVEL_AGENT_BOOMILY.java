package main;

import java.util.Scanner;
import travel.manajemen_tiket;
import travel.tiket_bisnis;
import travel.tiket_ekonomi;

public class TRAVEL_AGENT_BOOMILY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, harga;
        String nama_penumpang, destinasi;
    
        while (true){
            System.out.println("==============================");
            System.out.println("       MANAGEMENT TIKET       ");
            System.out.println("==============================");
            System.out.println("1. Tampilkan Daftar Tiket");
            System.out.println("2. Tambahkan Tiket Destinasi");
            System.out.println("3. Ubah Tiket Destinasi");
            System.out.println("4. Hapus Tiket Destinasi");
            System.out.println("5. Keluar");
            System.out.println("==============================");
            System.out.print("Masukkan Pilihan: ");
            int pilih = input.nextInt();
            
            switch(pilih){
                case 1 ->{
                    System.out.println("==============================");
                    System.out.println("          Daftar Tiket        ");
                    System.out.println("==============================");
                    manajemen_tiket.TampilkanDaftarTiket();
                    break;}
                
                case 2 ->{
                    System.out.println("======================");
                    System.out.println("  Pilih Kelas Tiket");
                    System.out.println("======================");
                    System.out.println("1. Tiket Bisnis");
                    System.out.println("2. Tiket Ekonomi");
                    System.out.println("======================");
                    System.out.print("Masukkan Pilihan: ");
                    int angka = input.nextInt();
                    input.nextLine();
                    switch (angka) {
                        case 1 -> {
                            System.out.print("Masukkan ID: ");
                            id = input.nextInt();
                            input.nextLine();
                            System.out.print("Masukkan Nama: ");
                            nama_penumpang = input.nextLine();
                            System.out.print("Masukkan Destinasi Tujuan: ");
                            destinasi = input.nextLine();
                            System.out.print("Masukkan Harga Tiket: ");
                            harga = input.nextInt();
                            manajemen_tiket.TambahTiket(new tiket_bisnis(id, nama_penumpang, destinasi, harga));
                        }case 2 -> {
                            System.out.print("Masukkan ID: ");
                            id = input.nextInt();
                            input.nextLine();
                            System.out.print("Masukkan Nama: ");
                            nama_penumpang = input.nextLine();
                            System.out.print("Masukkan Destinasi Tujuan: ");
                            destinasi = input.nextLine();
                            System.out.print("Masukkan Harga Tiket: ");
                            harga = input.nextInt();
                            manajemen_tiket.TambahTiket(new tiket_ekonomi(id, nama_penumpang, destinasi, harga));
                        }default -> System.out.println(">>> Masukkan Pilihan Dengan Benar! <<<");
                    }break;}
                
                case 3 ->{
                    System.out.println("======================");
                    System.out.println("  Pilih Kelas Tiket");
                    System.out.println("======================");
                    System.out.println("1. Tiket Bisnis");
                    System.out.println("2. Tiket Ekonomi");
                    System.out.println("======================");
                    System.out.print("Masukkan Pilihan: ");
                    int angka = input.nextInt();
                    input.nextLine();
                    if (angka == 1){
                        System.out.print("Masukkan ID Yang Ingin Diubah: ");
                        id = input.nextInt();
                        input.nextLine();
                        if (manajemen_tiket.getTiket(id)){
                            System.out.print("Masukkan Nama Baru: ");
                            nama_penumpang = input.nextLine();
                            System.out.print("Masukkan Destinasi Baru: ");
                            destinasi = input.nextLine();
                            System.out.print("Masukkan Harga Baru: ");
                            harga = input.nextInt();
                            manajemen_tiket.PerbaharuiDaftarTiket(id, new tiket_ekonomi(id, nama_penumpang, destinasi, harga));
                            System.out.println(">>> Tiket Berhasil Diubah! <<<");
                        } else if (!manajemen_tiket.getTiket(id)){
                            System.out.println(">>> ID Tidak Ditemukan! <<<");
                        }else{
                            System.out.println(">>> Masukkan Dengan Benar! <<<");
                        }
                    }else if (angka == 2){
                        System.out.print("Masukkan ID Yang Ingin Diubah: ");
                        id = input.nextInt();
                        input.nextLine();
                        if (manajemen_tiket.getTiket(id)){
                            System.out.print("Masukkan Nama Baru: ");
                            nama_penumpang = input.nextLine();
                            System.out.print("Masukkan Destinasi Baru: ");
                            destinasi = input.nextLine();
                            System.out.print("Masukkan Harga Baru: ");
                            harga = input.nextInt();
                            manajemen_tiket.PerbaharuiDaftarTiket(id, new tiket_ekonomi(id, nama_penumpang, destinasi, harga));
                            System.out.println(">>> Tiket Berhasil Diubah! <<<");
                        } else if (!manajemen_tiket.getTiket(id)){
                            System.out.println(">>> ID Tidak Ditemukan! <<<");
                        }else{
                            System.out.println(">>> Masukkan Dengan Benar! <<<");
                        }
                    }break;}
                
                case 4 ->{
                    System.out.print("Masukkan ID Tiket: ");
                    id = input.nextInt();
                    if (manajemen_tiket.getTiket(id)){
                        manajemen_tiket.HapusDaftarTiket(id);
                        System.out.println(">>> Tiket Berhasil Dihapus! <<<");
                    }else if (! manajemen_tiket.getTiket(id)){
                        System.out.println(">>> Tiket Tidak Ditemukan <<<");
                    }else{
                        System.out.println(">>> Masukkan Dengan Benar! <<<");
                    }break;}
                
                case 5 ->{
                    System.out.println("========================");
                    System.out.println(" PROGRAM TELAH BERAKHIR ");
                    System.out.println("========================");
                    System.exit(0);
                    break;}
                
                default ->{
                    System.out.println("Masukkan Pilihan Dengan Benar!");
                    break;}
            }
        }   
    }
}
