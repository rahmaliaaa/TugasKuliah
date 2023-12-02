import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SistemPenggajianGuru1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String namaMataPelajaran;
        String statusGuru;
        double pajak = 0;
        double gajiTotal = 0;
        int jumlahGuru = 0;
        int gajiPokok;
        int golongan;
        int jumlahKaryawan;
        int jumlahPerobaan = 0;
        int maksimalPercobaan = 0;

        String[] username = { "Devin", "Meisy", "Rahmalia" };
        String password[][] = { { "20040417" }, { "20040607" }, { "20050528" } };

        System.out.print("Masukkan username : ");
        nama = sc.nextLine();
        System.out.print("Masukkan password : ");
        String passwordInput = sc.nextLine();

        boolean loginSuccessful = false;
        for (int i = 0; i < username.length; i++) {
            if (username[i].equals(username) && password[i].equals(password[i][0])) {
                loginSuccessful = true;
                break;
            }
        }
        if (!loginSuccessful) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal!");
            System.out.println("Klik <enter> untuk kembali ke halaman login");
            sc.nextLine();
            return;
        }
        //if (jumlahPerobaan >= maksimalPercobaan) {
            //System.out.println("Anda telah mencapai batas percobaan login. Silahkan hubungi administrator");
       //}

        System.out.print("Masukkan jumlah guru : ");
        jumlahKaryawan = sc.nextInt();

        int i = 1;
        while (i <= jumlahKaryawan) {
            System.out.println("\nPilihan status pegawai - (PNS , HONORER)");
            String konfirmasi = sc.nextLine();
            System.out.print("Masukkan jabatan karyawan ke-" + (i) + " : ");
            statusGuru = sc.nextLine();
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan penghasilan (1000000 - 5000000) : ");
            gajiPokok = sc.nextInt();
            System.out.print("Masukkan golongan ( 1 atau 2 ) : ");
            golongan = sc.nextInt();
            i++;

            if (statusGuru.equalsIgnoreCase("PNS")) {
                if (golongan == 1) {
                    gajiPokok = 4000000;
                    pajak = 0.500;

                } else if (golongan == 2) {
                    gajiPokok = 5000000;
                    pajak = 0.150;

                } else {
                    System.out.println("Golongan PNS yang anda masukkan salah.");
                }
            } else if (statusGuru.equalsIgnoreCase("HONORER")) {
                if (golongan == 1) {
                    gajiPokok = 1000000;
                    pajak = 0.200;

                } else if (golongan == 2) {
                    gajiPokok = 2500000;
                    pajak = 0.300;

                } else {
                    System.out.println("Golongan honorer yang anda masukkan salah.");
                }
            } else {
                System.out.println("Golongan yang anda masukkan salah");
                break;
            }
            System.out.println(" MENGHITUNG GAJI KARYAWAN ");
            System.out.println(" ======================== ");
            System.out.println("Nama : " + nama);
            System.out.println("Jabatan : " + statusGuru);
            System.out.println("gaji pokok : " + gajiPokok);
            System.out.println("Gaji total : " + gajiTotal);

            gajiTotal = gajiPokok - pajak;
            System.out.println("gaji yang diterima adalah " + gajiTotal);
        }
    }
}