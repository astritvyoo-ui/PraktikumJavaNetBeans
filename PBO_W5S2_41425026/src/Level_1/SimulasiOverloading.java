/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level_1;

/**
 *
 * @author ASUS TUF GAMING
 */
// Class MesinTarif menyediakan fungsi fleksibel hitungOngkir
class MesinTarif {
    private String kotaAsal;

    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }
    
    // Menghitung ongkir berdasarkan berat saja
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }
    // Menghitung ongkir dengan tambahan asuransi
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Menghitung ongkir dengan layanan express
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000;
        }
        return total;
    }
}

public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg)          : Rp" + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (Barang 5Jt) : Rp" + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("Ongkir Express (2.0 Kg)        : Rp" + tarif.hitungOngkir(2.0, true));
    }
}

/*
1. dapat menentukan method hitungOngkir mana yang dijalankan
sebelum program dieksekusi (compile-time)? 
Bagian method apa yang diperiksa compiler?
=> Karena ketiga method mempunyai nama yang sama,tetapi parameter yang berbeda.
 Contohnya:
 hitungOngkir(double)
 hitungOngkir(double, double)
 hitungOngkir(double, boolean)

 Jadi compiler sudah bisa menentukan method mana yang
 dipanggil saat proses compile-time.

2. => Alasannya karena method tersebut mempunyai nama dan 
parameter yang sama persis dengan:
- public double hitungOngkir(double beratKg)

 Perbedaan return type data tidak cukup untuk membuat method overload.
 Jadi int dan double sebagai return type tidak dapat
 digunakan sebagai pembeda method.
*/