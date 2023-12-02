package Rekursif;
import java.util.Scanner;
public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int n = sc.nextInt();

        if (CekPrimaRekursif(n)) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(" maaf, bilangan yang anda masukkan bukan bilangan prima");
        }
    }
    public static boolean CekPrimaRekursif(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i<n; i++){
            if ( n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
