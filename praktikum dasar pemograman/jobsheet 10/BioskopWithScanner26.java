import java.util.Scanner;
public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String [][] penonton = new String[4][2];

        while (true) {
           System.out.println("Menu: ");
           System.out.println("1. Input data penonton");
           System.out.println("2. Tampilkan daftar penonton");
           System.out.println("3. Exit");

           System.out.print("Masukkan menu (1/2/3) : ");
           int choice = sc.nextInt();

           switch (choice) { //modifikasi nomor 2
            case 1:
                sc.nextLine();
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                
                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) { //modifikasi nomor 3
                    if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil diinput.");
                    } else { //modifikasi nomor 4
                        System.out.println("Kursi di baris " + baris + ", kolom " + kolom + "sudah terisi. Silahkan pilih kursi yang lain." );
                    }
                } else {
                    System.out.println("Nomor baris / kolom kursi tidak tersedia atau sudah terisi");
                }
                break;
            case 2:
                System.out.print("Daftar penonton: ");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", kolom " + (j+i) + ": " + penonton[i][j]);
                        } else { //modifikasi nomor 5
                            System.out.println("Baris " + (i + 1) + ", kolom " + (j+i) + ": ***"); 
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Terima kasih!");
                System.exit(0);
                break;
            default:
                System.out.println("Menu yang Anda pilih tidak valid. silahkan pilih 1, 2, 3.");
                break;
           }
        }
    }
}
