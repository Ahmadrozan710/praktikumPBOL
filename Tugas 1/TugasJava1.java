import java.util.Scanner;

public class TugasJava1 {

    static String nama;
    static int nim;

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void TambahDataMahasiswa() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        nama = scan.nextLine();
        System.out.print("Masukkan NIM  : ");
        nim = scan.nextInt();
        scan.nextLine();
        scan.close();

    }

    static void DaftarMahasiswa() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);


        System.out.println("Tekan Enter Untuk Melanjutkan");
        scan.nextLine();
        scan.close();

    }

    public static void main(String[] args) {
        clearScreen();
        Scanner scan = new Scanner(System.in);
        int pilihan = 0;

        // Menggunakan while untuk terus menampilkan menu
        while (pilihan != 3) {
            clearScreen();

            System.out.println("Data Mahasiswa");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Daftar mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scan.nextInt();
            scan.close();

            switch (pilihan) {
                case 1:
                    clearScreen();
                    TambahDataMahasiswa();
                    break;
                case 2:
                    clearScreen();
                    DaftarMahasiswa();
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        }
    }
}
