package Rekursif;
import java.util.Scanner;
public class Fibbonaci {
    static int Fibbonaci(int n){
        if (n <= 1){
            return n;
        } else {
            return Fibbonaci(n-1) + Fibbonaci(n-2);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Masukkan bulan ke- : ");
       int bulan = sc.nextInt();
       int jumlahMarmut = Fibbonaci(bulan);
       System.out.println("Jumlah pasangan marmut pada bulan ke- " + bulan + " adlaah " + jumlahMarmut);
    }
}
