import java.util.Scanner;
public class UTSnomor1 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double bobot;
        int i = 0;
        double totalNilai;
        String TPA, tesBahasaInggris, tesWawancara;


        System.out.print("Masukkan tahap tes (TPA, tes Bahasa Inggris, tes Wawancara):");
        String tahapTes= sc.nextLine();
    
        System.out.print("Masukkan nilai tes ke-1 (0 - 100) : ");
        int rentangNilai = sc.nextInt();

        if (tahapTes.equalsIgnoreCase("TPA")) {
            bobot = 0.5; 
            bobot = 0.5 * rentangNilai;
            System.out.print("nilai TPA : " + 0.5 * rentangNilai);
            } else if (tahapTes.equalsIgnoreCase("tes Bahasa Inggris")) {
            bobot = 0.3 * rentangNilai;
            System.out.print("nilai tes Bahasa Inggris: " + 0.3 * rentangNilai);
            } else if (tahapTes.equalsIgnoreCase("tes Wawancara")) {
            bobot = 0.2 * rentangNilai;
            System.out.print("nilai Wawancara: " + 0.2 * rentangNilai);
        } else {
            System.out.println("Masukkan Tahap tes yang benar");
         }
    {
    }
    
}}
