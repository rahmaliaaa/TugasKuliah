import java.util.Scanner;
public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : "); //meminta pengguna untuk menginputkan nilai N
        int N = sc.nextInt(); //membanca dan memasukkan nilai inputan dalam variabel N

        if (N < 5){ //memerikasa apakah N kurang dari 5
            System.out.println("N minimal harus 5"); //jika iya, program akan mencetak pesan.
            return; //program akan berhenti
        }
        for (int i = N; i >= 1; i--){ //untuk looping baris yang akan membentuk segitiga
            for(int j = i; j > 0; j--){ //untuk mencetak bintang pada setiap baris sejumlah i
                System.out.print("*"); //mencetak bintang
            }
            System.out.println(); //mencetak garis baru setelah program selesai
        }
        sc.close(); //menutup objek Scanner
    }
}
