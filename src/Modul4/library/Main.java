package Modul4.library;

import Modul4.data.Batman;
import Modul4.data.Flash;
import Modul4.data.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Flash();
        Hero hero1 = new Hero("", 32);
        Batman hero2 = new Batman("Bruce Wayne", 35);
        Batman hero3 = (Batman) hero2;

        System.out.println("Hero: " + hero1.getNama());
        hero.melindungi();
        hero2.melindungi();
        hero2.melindungi("gotham City", 20);
        hero3.melindungi("Pasurua", 1000000);
    }
}
