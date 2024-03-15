package Modul2;

 public class Utama {
    public static void main(String[] args){
        Mobil newMobil = new Mobil();

        newMobil.merk="Maclaren";
        System.out.println("merk mobil ku "+newMobil.merk);

        newMobil.menyalakanMesin();

        String pesan = newMobil.mengemudi("Timur");
        System.out.println(pesan);
        System.out.println(newMobil.mengemudi("Utara"));

        Motor.modelMotor();
        Mobil.model ="Suv";
        Motor.topSpeed = 100;

        newMobil.tahun = 2002;

        newMobil.setTahunPembuatan(2024);
        System.out.println("tahun \t " + newMobil.getTahunPembuatan());



    }
}
class Motor{

    public static int topSpeed;
    public static void modelMotor() {
        System.out.println("Model motor bebek");

    }
}
