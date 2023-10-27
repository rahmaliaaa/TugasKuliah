import java.util.Scanner;
public class ArrayRataNilai26 {
    public static void main(String[] args) {
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i< nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahaiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata = "+rata2);
    }
}
