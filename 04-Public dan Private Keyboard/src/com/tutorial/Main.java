package com.tutorial;

class  Player {
    // Data member
    String name;//default,bisa dibaca dan ditulis diluar class
    public int exp;//public,bisa dibaca dan ditulis diluar class
    private int health;//private, hanya bisa dibaca oleh class itu sendiri
    

    //konstrultor
    Player(String name, int exp, int health){
    this.name = name;
    this.exp = exp;
    this.health = health;

    }

    void display(){
        System.out.println("Hero 1 : " + this.name);
        System.out.println("Hero Health : " + this.health);
        System.out.println("Hero Exp : " + this.exp);
    }

}

public class Main {
    public static void main(String[] args) {
        //membuat objek atau instansiasi objek 
        Player hero_1 = new Player("uciha", 20, 100);

        //default
        System.out.println(hero_1.name);
        hero_1.name = "sukuna";
        System.out.println(hero_1.name);

        //public
        System.out.println(hero_1.exp);
        hero_1.exp = 50;
        System.out.println(hero_1.exp);

        //private
        hero_1.display();


    }   
}
