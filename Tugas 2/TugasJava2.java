import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TugasJava2 {

    static Map<Integer, String> Mhs = new HashMap<>();

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void TambahMahasiswa(Scanner scan) {

        clearScreen();

        System.out.print("Masukkan NIM: ");
        int nim = scan.nextInt();
        scan.nextLine();

        if (Mhs.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar. Tidak dapat menambahkan mahasiswa baru.");
        } else {
            System.out.print("Masukkan Nama: ");
            String nama = scan.nextLine();
            Mhs.put(nim, nama); 
            System.out.println("Mahasiswa berhasil ditambahkan.");
        }
    }

    public static void DaftarMahasiswa(Scanner scan) {

        clearScreen();

        int a = 1;

        if (Mhs.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Map.Entry<Integer, String> data : Mhs.entrySet()) {
                System.out.print(a++ + ". ");
                System.out.println("NIM     : " + data.getKey() );
                System.out.println("   Nama    : " + data.getValue());
            }
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scan.nextLine();

    }

    public static void UpdateMahasiswa(Scanner scan) {

        clearScreen();

        System.out.print("Masukkan NIM yang ingin diupdate: ");
        int nim = scan.nextInt();
        scan.nextLine(); 

        if (Mhs.containsKey(nim)) {
            System.out.print("Masukkan Nama baru: ");
            String namaBaru = scan.nextLine();
            Mhs.put(nim, namaBaru); 
            System.out.println("Data mahasiswa berhasil diupdate.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    public static void HapusMahasiswa(Scanner scan) {

        clearScreen();

        System.out.print("Masukkan NIM yang ingin dihapus: ");
        int nim = scan.nextInt();
        scan.nextLine();

        if (Mhs.containsKey(nim)) {
            Mhs.remove(nim); 
            System.out.println("Data mahasiswa berhasil dihapus.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        int pilihan = 0;
        
        while (pilihan != 5) {

            clearScreen();

            System.out.println("\nMenu Mahasiswa");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Daftar Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scan.nextInt();
            scan.nextLine(); 

            switch (pilihan) {
                case 1:
                    TambahMahasiswa(scan); 
                    break;
                case 2:
                    DaftarMahasiswa(scan); 
                    break;
                case 3:
                    UpdateMahasiswa(scan);  
                    break;
                case 4:
                    HapusMahasiswa(scan);  
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        }

        scan.close();  
    }
}
