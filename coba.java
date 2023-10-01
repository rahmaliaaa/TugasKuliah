
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        // Login
        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        // Verifikasi login
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("\n=== SELAMAT DATANG ===");

            // Input data guru
            System.out.print("\nBELQISNama Guru: ");
            String nama = input.nextLine();
            System.out.print("Tingkat Pendidikan: ");
            String pendidikan = input.nextLine();
            System.out.print("Jumlah Jam Mengajar: ");
            int jamMengajar = input.nextInt();

            // Hitung gaji
            double gajiDasar = hitungGajiDasar(pendidikan);
            double gajiTotal = hitungGajiTotal(gajiDasar, jamMengajar);

            // Tampilkan hasil
            System.out.println("\n=== DATA GAJI GURU ===");
            System.out.println("Nama Guru: " + nama);
            System.out.println("Tingkat Pendidikan: " + pendidikan);
            System.out.println("Jumlah Jam Mengajar: " + jamMengajar);
            System.out.println("Gaji Dasar: " + gajiDasar);
            System.out.println("Gaji Total: " + gajiTotal);
        } else {
            System.out.println("\nMaaf, login gagal. Silakan coba lagi.");
        }
    }

    public static double hitungGajiDasar(String pendidikan) {
        double gajiDasar = 0;
        if (pendidikan.equalsIgnoreCase("S1")) {
            gajiDasar = 5000000;
        } else if (pendidikan.equalsIgnoreCase("S2")) {
            gajiDasar = 6000000;
        } else if (pendidikan.equalsIgnoreCase("S3")) {
            gajiDasar = 7000000;
        }
        return gajiDasar;
    }

    public static double hitungGajiTotal(double gajiDasar, int jamMengajar) {
        double tunjanganJam = jamMengajar * 100000;
        double gajiTotal = gajiDasar + tunjanganJam;
        return gajiTotal;
    }
}
 
    

