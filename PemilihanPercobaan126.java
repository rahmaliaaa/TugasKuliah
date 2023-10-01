import java.util.Scanner;
public class PemilihanPercobaan126 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka;

        System.out.println("Masukkan Angka: ");
        angka = input26.nextInt();
        String hasil = angka % 2 == 0 ? "Adalah bilangan Genap" : "Adalah bilangan ganjil";
        System.out.println(hasil);
    }
}
