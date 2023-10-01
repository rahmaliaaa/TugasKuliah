

import java.util.Scanner;
public class Harga_Bayar_27 {
    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            //Deklarasi
            String merkBuku;
            int harga, jumlah,jumlahHalaman;
            double dis=0.1, total, bayar, jmlDis;
            //Input 
            System.out.println("Masukkan merk buku");
            merkBuku=input.next();
            System.out.println("Masukkan harga barang yang dibeli ");
            harga=input.nextInt();
            System.out.println("Masukkan jumlah barang yang dibeli ");
            jumlah=input.nextInt();
            System.out.println("Masukkan Jumlah Halaman Buku");
            jumlahHalaman=input.nextInt();
            System.out.println("Masukkan Dis:");
            dis=input.nextDouble();
            total=harga*jumlah*jumlahHalaman;
            jmlDis=total*dis;
            bayar=total-jmlDis;

            System.out.println("Merk Buku: " + merkBuku);
            System.out.println("Diskon yang anda Dapatkan: " +jmlDis);
            System.out.println("Jumlah yang harus dibayar: " +bayar);
        }
}
