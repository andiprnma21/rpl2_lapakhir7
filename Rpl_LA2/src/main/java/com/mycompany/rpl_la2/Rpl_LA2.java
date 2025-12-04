package com.mycompany.rpl_la2;

// Kelas utama (file: Rpl_LA2.java)
public class Rpl_LA2 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Mimi");
        Hewan anjing = new Anjing("Rocky");

        // Pemanggilan method yang sama menghasilkan perilaku berbeda
        kucing.bersuara();
        anjing.bersuara();
    }
}

// Kelas induk (Superclass) - non-public top-level class
class Hewan {
    private String nama; // Enkapsulasi

    public Hewan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void bersuara() { // Akan dioverride di subclass
        System.out.println("Hewan ini mengeluarkan suara.");
    }
}

// Kelas turunan (Subclass) 1
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama); // Memanggil constructor dari kelas induk
    }

    @Override
    public void bersuara() { // Polimorfisme (overriding)
        System.out.println(getNama() + " berkata: Meong!");
    }
}

// Kelas turunan (Subclass) 2
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() { // Polimorfisme (overriding)
        System.out.println(getNama() + " berkata: Guk guk!");
    }
}
