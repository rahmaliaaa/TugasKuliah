package Rekursif;
public class DeretDescendingRekursif {
    // Fungsi rekursif 
    static void deretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }
    // Fungsi iteratif 
    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5; 

        System.out.println("Deret Rekursif:");
        deretRekursif(n);
        System.out.println("\nDeret Iteratif:");
        deretIteratif(n);
    }
}
