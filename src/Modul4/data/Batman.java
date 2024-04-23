package Modul4.data;

public class Batman extends Hero {

    public Batman(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void melindungi() {
        super.melindungi();
        System.out.println(super.getNama() + "Batman melindungi masyarakat pasuruan");
    }

    public void melindungi(String warga) {
        System.out.println(super.getNama() + "Melindungi" + warga);
    }

    public void melindungi(String warga, int jumlah) {
        System.out.println(super.getNama() + "Melindungi" + jumlah + "Orang" + warga + 20);
    }

}

