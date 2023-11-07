package com.tutorial;

// class tanpa konstruktor
class Polos {
    String dataString;
    int dataInteger;
}

// class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;

// Membuat konstruktor
Mahasiswa() {
System.out.println(x:"Ini adalah konstruktor");
}

    // membuat konstruktor dengan parameter
    Mahasiswa( String inputNama, String inputNIM, String inputProdi) {
        nama = inputNama;
        nim = inputNIM;
        prodi = inputProdi;

        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Prodi :" + prodi);

    }

}

public class Main {
    public static void main(String[] args) {
        // instansiasi objek dari class polos
        // Polos pls = new Polos();

        // // isi ciri pada objek polos

        // pls.dataString = "POLOS";
        // pls.dataInteger = 10;

        // // cetak data 
        // System.out.println("Isi Data String : " + pls.dataString);
        // System.out.println("isi Data Integer : " + pls.dataInteger);

        Mahasiswa mhs1 = new Mahasiswa("bayu", "22241003", "Pendidikan Teknologi Informasi");


        // memanggil konstruktor
        


    }   
}
