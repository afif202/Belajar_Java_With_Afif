package Modul3.Codelab;

import java.util.Scanner;

public class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    Kubus(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai(String type) {
        super.inputNilai("Kubus");
        System.out.print("Input sisi: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume() {
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}