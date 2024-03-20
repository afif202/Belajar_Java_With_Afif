package Modul3.Codelab;

public class BangunRuang {
    private String name;

    BangunRuang(String name) {
        this.name = name;
    }

    public void inputNilai(String type) {
        System.out.println("=Input nilai " + type);
    }

    public void luasPermukaan() {
        System.out.println("Menghitung luas permukaan bangun " + name);
    }

    public void volume() {
        System.out.println("Menghitung volume bangun " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}