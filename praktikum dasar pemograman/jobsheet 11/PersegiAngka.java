import java.util.Scanner;
public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = "); //meminta pengguna untuk menginputkan nilai N
        int N = sc.nextInt(); //untuk membaca dan menyimpan nilai N dalam variabel N

        if (N < 3){ //mengecek apakah N kurang dari 3
            System.out.println("N minimal harus 3"); //jika iya, maka pesan akan dicetak
            return; //program akan berhenti
           }
        for (int i = 1; i <= N; i++){ //melakukan perulangan dari i sampai N, ini adalah outer loop
            for (int j = 1; j <= N; j++){ //memulai nested loop
                if (i == 1 || i == N || j == 1 || j == N) { // Jika i atau j sama dengan 1 atau N, maka program akan mencetak angka N. Jika tidak, program akan mencetak spasi.
                    System.out.print(N + " ");
                } else { //jika tidak akan mencetak spasi
                    System.out.print("  ");
                }
            }
            System.out.println(" "); //mencetak baris baru setelah program berhasil
        }
           sc.close(); //menutup obejk Scanner
    }
}
