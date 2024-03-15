package Modul2.Codelab;

import java.util.Scanner;

public class Mahasiswa {
    static String nama;
    static String nim;
    static String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        Mahasiswa.nama = nama;
        Mahasiswa.nim = nim;
        Mahasiswa.jurusan = jurusan;
    }

    public static void tampilDataMahasiswa() {
        System.out.println("=== Daftar mahasiswa sebagai berikut ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void tambahkanDataMahasiswa() {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Data Mahasiswa");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        if (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 angka.");
            return;
        }
        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();


        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);

        tampilUniversitas();
        tampilDataMahasiswa();
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }
}
