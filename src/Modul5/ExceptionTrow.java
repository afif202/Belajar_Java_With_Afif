package Modul5;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionTrow {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        int i = 1;
        while (true) {
            System.out.print("Masukkan nama mahasiswa ke-" + i++ + " :");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                if (input.isEmpty()) {
                    i--;
                    throw new IllegalArgumentException("Nama tidak boleh kosong");

                }
                mahasiswa.add(input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Daftar nama mahasiswa:");
        for (String nama : mahasiswa) {
            System.out.println(nama);
        }

        scanner.close();
    }
}
