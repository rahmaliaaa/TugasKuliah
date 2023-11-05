import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SistemPenggajianGuruFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMataPelajaran, statusGuru, nama, name, jabatan, next;
        String people = " ";
        String Devin, Meisy, Rahmalia;
        double pajak = 0, gajiTotal = 0, gajiTot = 0, potonganGaji = 0, gajiPokok = 0, gajiBersih = 0, gajiaman = 0,
                tax = 0;
        int jumlahGuru = 0, golongan, jumlahKaryawan;
        int jumlahPercobaan = 0;
        int maksimalPercobaan = 3;
        int nip, menu, guru1, kehadiran, gajiGuru;
        int jumlahTidakMasuk = 0;

        String[] username = { "Devin", "Meisy", "Rahmalia" };
        String password[][] = { { "20040417" }, { "20040607" }, { "20050228" } };

        System.out.print("Masukkan username : ");
        String usernameInput = sc.nextLine();
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
        // if (jumlahPercobaan >= maksimalPercobaan) {
        // System.out.println("Anda telah mencapai batas percobaan login. Silahkan
        // hubungi administrator");
        // }

        System.out.println("-----------------MENU-----------------");
        System.out.println("1. Cek Gaji Guru");
        System.out.println("2. Cek Data Guru");
        System.out.println("3. Cek Kehadiran Guru");
        System.out.println("4. Cetak Slip Gaji");
        System.out.println("5. Exit");
        System.out.println("--------------------------------------");
        System.out.println("Pilihan menu 1/2/3/4/5: ");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
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
                break;
            case 2:
                List<String> namaGuru = new ArrayList<>();
                namaGuru.add("Devin");
                namaGuru.add("Meisy");
                namaGuru.add("Rahmalia");
                namaGuru.add("Renald");
                namaGuru.add("Belqis");
                namaGuru.add("Aqila");

                List<String> mataPelajaran = new ArrayList<>();
                mataPelajaran.add("Bahasa Inggris");
                mataPelajaran.add("Akuntansi");
                mataPelajaran.add("Seni Budaya");
                mataPelajaran.add("Olahraga");
                mataPelajaran.add("Matematika");
                mataPelajaran.add("Bahasa Indonesia");

                List<Integer> kodeGuru = new ArrayList<>();
                kodeGuru.add(20040417);
                kodeGuru.add(20040607);
                kodeGuru.add(20050528);
                kodeGuru.add(20040416);
                kodeGuru.add(20040415);
                kodeGuru.add(20040414);

                for (int j = 0; j < namaGuru.size(); j++) {
                    System.out.println("nama guru: " + namaGuru.get(j) + ", mata pelajaran: " + mataPelajaran.get(j)
                            + ", kode guru: " + kodeGuru.get(j));
                }
                break;
            case 3:
                while (true) {
                    System.out.println("----------KEHADIRAN GURU-----------");
                    System.out.println("1. Devin ");
                    System.out.println("2. Meisy ");
                    System.out.println("3. Rahmalia ");
                    System.out.println("4. Exit ");
                    System.out.println("-----------------------------------");
                    System.out.print("Pilih nama guru 1/2/3/4 : ");
                    kehadiran = sc.nextInt();

                    switch (kehadiran) {
                        case 1:
                            int jumlahTeacher = 0;
                            int[][] presence = new int[5][20];

                            System.out.print("Masukkan jumlah guru: ");
                            jumlahTeacher = sc.nextInt();

                            for (int p = 0; p < jumlahTeacher; p++) {
                                for (int j = 0; j < 20; j++) {
                                    presence[p][j] = 0;
                                }
                            }
                            for (int p = 0; p < jumlahTeacher; p++) {
                                for (int j = 0; j < 20; j++) {
                                    System.out.print(
                                            "Masukkan kehadiran guru ke-" + (p + 1) + " hari ke-" + (j + 1) + ": ");
                                    presence[p][j] = sc.nextInt();
                                }
                            }
                            for (int p = 0; p < jumlahTeacher; p++) {
                                int jumlahPresence = 0;
                                for (int j = 0; j < 20; j++) {
                                    jumlahPresence += presence[p][j];
                                }
                                System.out.println("Jumlah kehadiran guru ke-" + (p + 1) + " adalah " + jumlahPresence);
                            }
                        case 2:

                        case 3:

                        case 4:
                            System.out.println("kembali ke halaman utama");
                            main(args);
                            break;

                        default:
                    }
                }
            case 4:
                System.out.println("Masukkan data guru satu persatu: ");
                for (int o = 0; o < 5; o++) {

                    System.out.println("Nama guru: ");
                    people = sc.nextLine();
                    System.out.println("NIP: ");
                    nip = sc.nextInt();
                    System.out.println("Jabatan: ");
                    jabatan = sc.nextLine();
                    System.out.println("Gaji pokok: ");
                    gajiaman = sc.nextInt();
                    System.out.println("Pajak: ");
                    tax = sc.nextInt();
                    System.out.println("Jumlah tidak masuk: ");
                    jumlahTidakMasuk = sc.nextInt();

                    if (jumlahTidakMasuk == 1) {
                        potonganGaji = 14.400;
                    } else if (jumlahTidakMasuk == 2) {
                        potonganGaji = 28.800;
                    } else if (jumlahTidakMasuk == 3) {
                        potonganGaji = 43.200;
                    } else if (jumlahGuru == 4) {
                        potonganGaji = 57.600;
                    } else {
                        potonganGaji = 0;
                    }

                    double totalGaji = gajiaman - tax - potonganGaji;

                    System.out.println("Data guru:");
                    System.out.println("Nama guru: " + people);
                    System.out.println("NIP: " + nip);
                    System.out.println("Jabatan: " + jabatan);
                    System.out.println("Gaji pokok: " + gajiaman);
                    System.out.println("Pajak: " + tax);
                    System.out.println("Potongan gaji: " + potonganGaji);
                    System.out.println("Total Gaji: " + totalGaji);
                }
            case 5:
                System.out.println("Terima kasih telah menggunakan layanan ini.");
                break;
            default:
                System.out.println("INVALID");
                break;
        }
    }
}