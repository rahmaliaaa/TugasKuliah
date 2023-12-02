import java.util.Scanner;
public class tugasFungsi1 {

    public static void main(String[] args) {
        // Inisialisasi variabel
        int[][] nilai = new int[5][7];
        int nilaiTertinggi = 0;
        int mahasiswaTertinggi = 0;

        // Fungsi Input
        inputNilai(nilai);

        // Fungsi Tampilkan Semua Nilai
        tampilSemuaNilai(nilai);

        // Fungsi Cari Nilai Tertinggi
        nilaiTertinggi = cariNilaiTertinggi(nilai);
        mahasiswaTertinggi = cariMahasiswaTertinggi(nilai);

        // Fungsi Tampilkan Nilai Tertinggi
        tampilNilaiTertinggi(nilaiTertinggi, mahasiswaTertinggi);
    }

    public static void inputNilai(int[][] nilai) {
        // Input data nilai mahasiswa
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + 
                                 " tugas ke-" + (j + 1) + ": "); //modifikasi
                nilai[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilSemuaNilai(int[][] nilai) {
        // Tampilkan semua nilai mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int cariNilaiTertinggi(int[][] nilai) {
        // Cari nilai tertinggi dari semua nilai mahasiswa
        int nilaiTertinggi = nilai[0][0];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                }
            }
        }
        return nilaiTertinggi;
    }

    public static int cariMahasiswaTertinggi(int[][] nilai) {
        // Cari mahasiswa yang memiliki nilai tertinggi
        int mahasiswaTertinggi = 0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] == cariNilaiTertinggi(nilai)) {
                    mahasiswaTertinggi = i + 1;
                }
            }
        }
        return mahasiswaTertinggi;
    }

    public static void tampilNilaiTertinggi(int nilaiTertinggi, int mahasiswaTertinggi) {
        // Tampilkan nilai tertinggi dan mahasiswa yang memiliki nilai tertinggi
        System.out.println("Nilai tertinggi: " + nilaiTertinggi );
        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke- : " + mahasiswaTertinggi);
    
    }
}