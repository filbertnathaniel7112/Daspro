import java.util.Scanner;

public class Segitiga13{
    public static void main(String[] args) {
        // Deklarasi variabel
        try ( // Deklarasi Scanner
                Scanner sc = new Scanner(System.in)) {
            int alas, tinggi;
            float luas;
            // Perintah penginputan
            System.out.print("Masukkan alas: ");
            alas = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            tinggi = sc.nextInt();
            // Proses perhitungan luas
            luas = alas * tinggi / 2;
            // Menampilkan hasil
            System.out.println("Luas segitiga: " + luas);
            // Menutup Scanner
        }
    }
}