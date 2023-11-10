package com.tutorial;
class HitunganLingkaran {
    int  jarijari ;
    double phi ;
    double keliling , luas ;

    HitunganLingkaran ( int  jarijari , double  phi ){
        this . jarijari = jarijari ;
        this. phi = phi ;
        this. keliling = 2 * phi * jarijari ;
        this. luas = phi * jarijari * jarijari ;
    }
    void show (){


        System .out. println ( "x======LINGKARAN=======" );
        System .out . println ( "Jari-jari Lingkaran" + this .jarijari + "cm" ) ;
        System .out . println ( "keliling Lingkaran" + this .keliling + "cm" ) ;
        System .out . println ( "Lingkaran" + this .luas + "cm2" ) ;
    }
    
}



public class Main {
    public static void main(String[] args) {
        HitunganLingkaran  h1 = new HitunganLingkaran   ( 6 , 3.14 );
        h1 .show ();
        HitunganLingkaran  h2 = new HitunganLingkaran   ( 7 , 3.14 );
        h2 .show ();
        HitunganLingkaran  h3 = new HitunganLingkaran  ( 10 , 3.14 );
        h3 . show ();
    }  
    
    

}
