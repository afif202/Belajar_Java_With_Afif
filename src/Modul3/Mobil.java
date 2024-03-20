package Modul3;

public class Mobil {
    private String name;
    int speed;

    Mobil() {
        System.out.println("Ini adalah constructor");
        this.name = "No name";
    }

    Mobil(String name) {
        this.name = name;
        this.speed = 25;
    }

    Mobil(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class menyala {


    }
}
