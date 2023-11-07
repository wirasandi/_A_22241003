package com.tutorial;

class mahasiswa {
  String nama;
  String NIM;
  String prodi;
}


public class Main {
  public static void main(String[] args) {
    // instansiansi pembuatan objek
    mahasiswa mhs1 = new mahasiswa();

    // objek mhs1 diberi atribut
    mhs1.nama = "madara";
    mhs1.NIM = "22241003";
    mhs1.prodi = "pendidikan teknologi informasi";
    
    System.out.println("nama mahasisa : " + mhs1.nama);
    System.out.println("NIM mahasiswa : " + mhs1.NIM);
    System.out.println("program studi : " + mhs1.prodi);

    mahasiswa mhs2 = new mahasiswa();
mhs2.nama = "sambul izzon";
mhs2.NIM = "22241008";
mhs2.prodi = "biologi";

System.out.println("nama mahasisa : " + mhs2.nama);
System.out.println("NIM mahasiswa : " + mhs2.NIM);
System.out.println("program studi : " + mhs2.prodi);

  }  
}
