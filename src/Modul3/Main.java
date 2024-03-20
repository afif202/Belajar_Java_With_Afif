package Modul3;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Lambo");
        Ferrari mobil3 = new Ferrari("Turbo N1");


        System.out.println(mobil1.getName());
        System.out.println(mobil1.speed);

        mobil1.speed = 425;
//        mobil1.name = "Chiron";
        mobil1.setName("Civic");
        System.out.println("Nama Mobil ke 1 = " + mobil1.getName());
        System.out.println("Top Speed Mobil ke 1 = " + mobil1.speed);

        System.out.println("Nama Mobil ke 2 = " + mobil2.getName());
        System.out.println("Top Speed Mobil ke 2 = " + mobil2.speed);

        System.out.println("Top Speed Mobil ke 3 = " + mobil3.getName());


    }
}
