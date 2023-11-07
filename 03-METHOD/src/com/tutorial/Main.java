package com.tutorial;

class Mahasiswa{
    // data member
    String nama;
    String nim;
    String prodi;

    //construktor dengan parameter
    Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;

    }

    // method tanpa parameter dan tanpa return
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Prodi : " + this.prodi);

    }

    // method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }
    
    // method dengan return dengan parameter
    String sayHi(String pesan){
        return pesan + "Aku adalah " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        // instansiasi objek
        Mahasiswa mhs1 = new Mahasiswa("bayu", "22241003", "PTI");

        mhs1.show();
        mhs1.setNama("windi ");
        mhs1.show();
        System.out.println(mhs1.getNama());

        String pesan = mhs1.sayHi("Hallo ");
        System.out.println(pesan);

    }   
}
