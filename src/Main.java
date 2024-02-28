import java.util.Scanner;

class Main {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("==== Selamat datang di Perpustakaan Mobile! ====");

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.println("\nSilakan pilih jenis user:");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanf.nextInt();
            scanf.nextLine();

            switch (choice) {
                case 1:
                    isLoggedIn = mahasiswaLogin(scanf);
                    break;
                case 2:
                    isLoggedIn = adminLogin(scanf);
                    break;
                case 3:
                    System.out.println("Terima kasih telah mengakses Perpustakaan Mobile");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi 1-3.");
            }
        }
    }

    private static boolean mahasiswaLogin(Scanner scanf) {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanf.nextLine();
        if (nim.length() == 15) {
            System.out.println("anda berhasil login sebagai mahasiswa");
            return true;
        }else {
            System.out.println("NIM tidak valid.");
        }
        return false;
    }

    private static boolean adminLogin(Scanner scanf) {
        System.out.print("Masukkan username admin: ");
        String username = scanf.nextLine();
        System.out.print("Masukkan password admin: ");
        String password = scanf.nextLine();
        if ( username.equals(ADMIN_USERNAME) && ADMIN_PASSWORD.equals(password)){
            System.out.print("Anda admin");
            return true;
       } else {
            System.out.print("username atau password anda salah");
        }
        return false;
        }
    }
