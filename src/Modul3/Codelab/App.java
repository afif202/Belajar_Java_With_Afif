package Modul3.Codelab;

public class App {
    public static void main(String[] args) {
        Tabung tabung = new Tabung("tabung");
        Kubus kubus = new Kubus("kubus");
        Balok balok = new Balok("balok");


        kubus.inputNilai("Kubus");
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai("Tabung");
        tabung.luasPermukaan();
        tabung.volume();

        balok.inputNilai("Balok");
        balok.luasPermukaan();
        balok.volume();
    }
}