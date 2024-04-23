package Modul4.data;

public class Hero {


    private String nama;
    int umur;

    public Hero(String nama) {
        this.nama = nama;
    }

    public Hero(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public Hero() {
    }

    public void melindungi() {
        System.out.println(nama + " melindungi masyarakat");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
