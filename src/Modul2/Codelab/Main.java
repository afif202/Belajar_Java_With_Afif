package Modul2.Codelab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLogin = true;

        while (isLogin) {

            System.out.println("Menu: ");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    Mahasiswa.tambahkanDataMahasiswa();
                    break;
                case 2:
                    Mahasiswa.tampilUniversitas();
                    Mahasiswa.tampilDataMahasiswa();
                    break;
                case 3:
                    System.out.println("sampaki jumpa dilain hari");
                    isLogin = false;
                    break;
                default:
                    System.out.println("tolong input opsi 1-3");
            }
        }
    }
}