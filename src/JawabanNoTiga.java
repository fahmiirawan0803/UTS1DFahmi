import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Scanner;

public class JawabanNoTiga {
    public static void inputPlat() {

        while (true) {
            System.out.println("==================================");
            System.out.println(" ");
            System.out.println("Masukan huruf depan plat nomor (contoh : B-)");
            Scanner platNomor = new Scanner(System.in);
            String infoPlat = platNomor.next();
            System.out.println("Masukan angka pada plat nomor");
            Scanner angkaPlatNomor = new Scanner(System.in);
            int angkaBelakang = angkaPlatNomor.nextInt();

            String sub1 = infoPlat.substring(0, 2);
            System.out.println("Plat nomor " + infoPlat + angkaBelakang);
            if (sub1.contains("K")) {
                System.out.println("Berasal dari Kudus");
            } else if (sub1.contains("B-")) {
                System.out.println("Berasal dari Jakarta");
            } else if (sub1.contains("AB")) {
                System.out.println("Berasal dari Jogja");
            } else if (sub1.contains("T-")) {
                System.out.println("Berasal dari Karawang");
            } else if (sub1.contains("AD")) {
                System.out.println("Berasal dari Solo");
            } else {
                System.out.println("Masukan plat nomor");
            }

            if (angkaBelakang % 2 == 0) {
                System.out.println("Plat tersebut termasuk plat GENAP");
            } else {
                System.out.println("Plat tersebut termasuk plat GANJIL");
            }

            System.out.println("| Jumlah plat nomor K : " + " | Jumlah plat nomor B : " + " Jumlah plat nomor AB : ");
            System.out.println("| Jumlah plat nomor AD : "  + " | Jumlah plat nomor T : ");
            System.out.println("Jumlah plat nomor Genap : ");
            System.out.println("Jumlah plat nomor Ganjil : ");
        }
    }

    public static void jmlPlat(){
        String[] jmlPlat = new String[]{"Kudus", "Jakarta", "Jogja", "Karawang", "Solo"};

    }

    public static void main(String[] args) {
        inputPlat();
    }
}
