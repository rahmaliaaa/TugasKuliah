import java.util.Scanner;
public class TugasArray26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = sc.nextInt();
        }

        int nilaiTertinggi = arrayInt[0];
        int nilaiTerendah = arrayInt[0];
        int totalNilai = arrayInt[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }
            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }
            totalNilai += arrayInt[i];
        }

        double rataRata = (double) totalNilai / jumlahElemen;

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-Rata: " + rataRata);
    }
}
