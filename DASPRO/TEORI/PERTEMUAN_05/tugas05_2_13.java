import java.util.Scanner;

public class tugas05_2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int antrean;
        System.out.print("Masukkan kode layanan : ");
        antrean = sc.nextInt();

        switch (antrean) {
            case 1 -> {
                System.out.println("Layanan : Legalisir Ijazah");
                System.out.println("Loket : A");
            }
            case 2 -> {
                System.out.println("Layanan : Surat keterangan akif kuliah");
                System.out.println("Loket : B");
            }
            case 3 -> {
                System.out.println("Layanan : Pembayaran UKT");
                System.out.println("Loket : C");
            }
            case 4 -> {
                System.out.println("Layanan : Pengajuan cuti akademik");
                System.out.println("Loket : D");
            }
            default -> {
                System.out.println("Kode antrean tidak valid");
                
                sc.close();
            }
        }
    }
}