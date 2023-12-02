package Rekursif;
import java.util.Scanner;

public class PenjumlahanRekursif {
    static int PenjumlahanRekursif(int n){
        if (n == 1){
            return 1;
        } else {
            return n + PenjumlahanRekursif(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n :  "); //input n 
        int angka = sc.nextInt();
        int hasil = PenjumlahanRekursif(angka); 
        System.out.println("Penjumlahan rekursif dari 1 hingga " +angka+ " adalah : " +hasil);
        System.out.print("1");
        for(int i = 2; i <= angka; i++) { //menampilkan proses penjumlahan
            System.out.print("+" +i);
        } 
        System.out.println(" = " + hasil);
        sc.close();
    }
}
