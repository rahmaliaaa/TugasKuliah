import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan Nilai N = "); //untuk memasukkan nilai N
        int N = sc.nextInt(); //membaca inputan dan menyimpannya dalam variabel N

        if (N < 3){ //untuk memeriksa apakah N minimal 3
            System.out.println("N minimal harus 3"); //jika iya maka program akan mencetak "N minimal harus 3"
        } else {  // Jika tidak, melanjutkan pembentukan segitiga angka
            for(int i = 1; i <= N; i++){ //looping akan berjalan dari 1 sampai N
                for(int j = N; j > i; j--){ //mencetak spasi sebelum angka pada setiap baris dan akan berkurang hingga terbentuk pola segitiga
                System.out.print(" "); //mencetak spasi
                }
                for(int x = 1; x <= i; x++){ //mencetak angka pada setiap baris dam angka yang tercetak akan terus bertambah seiring nilai i.
                System.out.print(x);
                }
                System.out.println(); //mencetak baris baru
            }
        }
        sc.close(); //menutup objek Scanner
    }
}
