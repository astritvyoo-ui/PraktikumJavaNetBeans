/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author ASUS TUF GAMING
 */
// Parent class
abstract class KendaraanEkspedisi {

    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor parent
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Method abstract wajib dibuat oleh child class
    public abstract void angkutBarang(String namaBarang);
}


// Child class TrukBox
class TrukBox extends KendaraanEkspedisi {

    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println(
            "Truk [" + noPolisi + "] memuat \""
            + namaBarang
            + "\" ke dalam kontainer tertutup pendingin."
        );
    }
}


// Child class MobilVan
class MobilVan extends KendaraanEkspedisi {

    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println(
            "Mobil Van [" + noPolisi + "] memuat \""
            + namaBarang
            + "\" di bagasi belakang untuk distribusi kota."
        );
    }
}


// Class utama
public class SimulasiPolimorfisme {

    public static void main(String[] args) {

        // Array bertipe parent class.
        // Tetapi objek di dalamnya berasal dari child class yang berbeda.
        KendaraanEkspedisi[] armada = {
            new TrukBox("BK 1234 DEL", 100),
            new MobilVan("BK 5678 DEL", 50)
        };

        // Satu for-loop dapat memanggil method yang sama.
        for (KendaraanEkspedisi kendaraan : armada) {

            // Java otomatis menjalankan method sesuai
            // dengan objek aslinya.
            kendaraan.angkutBarang("Paket LOGIX");
        }
    }
}
