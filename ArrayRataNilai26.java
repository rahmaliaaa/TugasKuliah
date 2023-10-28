import java.util.Scanner;
public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt(); 

        int[] nilaiMhs= new int[jumlahMahasiswa]; //modifikasi
        double totalLulus = 0; //modifikasi
        double totalTidakLulus = 0; //modifikasi
        double rataLulus = 0; //modifikasi
        double rataTidakLulus = 0; //modikasi
        int jumlahLulus = 0; 

        for (int i = 0; i< nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahaiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i]; //modifikasi
                jumlahLulus++; 
            } else {
                totalTidakLulus += nilaiMhs[i]; //modikasi
            }
        }
        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus;
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus. ");
        }
        if (jumlahMahasiswa - jumlahLulus > 0) {
            rataTidakLulus = totalTidakLulus / (jumlahMahasiswa - jumlahLulus);
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
        }
    }

