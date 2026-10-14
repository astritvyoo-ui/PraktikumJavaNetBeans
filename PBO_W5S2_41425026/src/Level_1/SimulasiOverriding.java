/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level_1;

/**
 *
 * @author ASUS TUF GAMING
 */
// Parent Class
class KurirReguler {
    protected String nama;

    public KurirReguler(String nama) {
        this.nama = nama;
    }

    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke alamat " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

// Child Class yang melakukan Overriding pada method kirimBarang
class KurirDrone extends KurirReguler {
    private String idDrone;

    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama + " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");
        KurirReguler k1 = new KurirReguler("Budi");
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

/* 
1.=> Method kirimbarang() dengan huruf "b" kecil bukanlah
 method yang sama dengan kirimBarang() milik parent.
 Java bersifat case-sensitive, sehingga: kirimBarang
 berbeda dengan: kirimbarang
jadi kode ini tidak berhasil dioverride.
outputnya adalah jalur darat.

2.=> Ketika @Override dikembalikan di atas method yang salah ketik, program akan
mengalami error saat kompilasi. Hal ini terjadi karena @Override memberi tahu 
Java bahwa method tersebut harus melakukan overriding terhadap method dari 
parent class. Namun, karena nama method ditulis kirimbarang() sedangkan method
parent adalah kirimBarang(), Java tidak menemukan method yang 
sesuai untuk dioverride.

3. Menurut saya, method overriding berarti method di class child dibuat 
dengan nama dan parameter yang sama seperti method di parent class, 
tetapi isi/perilakunya dibuat berbeda.

*/