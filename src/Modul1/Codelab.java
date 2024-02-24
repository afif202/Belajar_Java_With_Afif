package Modul1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Codelab {
    public static void main(String[] args) {
        String name;
        String gender;
        String birthDay;

        Scanner scanf = new Scanner(System.in);

        System.out.print("Masukkan Nama anda: ");
        name = scanf.nextLine();
        System.out.print("Anda Laki-Laki / Perempuan (L/P): ");
        gender = scanf.nextLine();
        System.out.print("Masukkan Tanggal Lahir (yyyy-mm-dd) : ");
        birthDay = scanf.nextLine();

        LocalDate tanggalLahir= LocalDate.parse(birthDay);
        LocalDate hariIni = LocalDate.now();
        Period period = Period.between(tanggalLahir,hariIni);

        if (gender.equals("L") || gender.equals("l") ){
            gender = "Laki-Laki";
        } else if(gender.equals("P") || gender.equals("p")){
            gender = "Perempuan";
        } else {
            gender="hanya tersedia Laki dan perempuan. sillahkan input kembali";
        }

        System.out.println("=========");
        System.out.println("Name: " + name);
        System.out.println("Gender: "+ gender);
        System.out.println("Age " + period.getYears() + " tahun, " + period.getMonths() + " bulan, dan " + period.getDays() + " hari.");
    }
}
