package Modul2;

public class Mobil {
    String merk;

    static String model;
    String spekMesin;
    int tahun;
    private int setTahunPembuatan;

    void menyalakanMesin() {
        System.out.println("Mesin menyala abang ku");
    }

    String mengemudi(String arah) {
        return "Mobil bergerak ke arah" + arah;
    }

    public void setTahunPembuatan(int tahun) {
        this.setTahunPembuatan = tahun;
    }

    public int getTahunPembuatan() {
        return setTahunPembuatan;

    }


}
