import java.util.Arrays;
import java.util.Formattable;
import java.util.Scanner;

public class JawabanNoTiga {
    public static void inputPlat() {
        String[] myArrays = new String[]{"Kudus", "Jakarta", "Jogja", "Karawang", "Solo"};
        while (true) {
            System.out.println("==================================");
            System.out.println("masukan huruf depan plat nomor (contoh : B-)");
            Scanner platNomor = new Scanner(System.in);
            String infoPlat = platNomor.next();
            System.out.println("masukan angka pada plat nomor");
            Scanner angkaPlatNomor = new Scanner(System.in);
            int angkaBelakang = angkaPlatNomor.nextInt();

            String sub1 = infoPlat.substring(0, 2);
            System.out.println("Plat nomor " + infoPlat + angkaBelakang);
            if (sub1.contains("K")) {
                System.out.println("berasal dari Kudus");
            } else if (sub1.contains("B-")) {
                System.out.println("berasal dari Jakarta");
            } else if (sub1.contains("AB")) {
                System.out.println("berasal dari Jogja");
            } else if (sub1.contains("T-")) {
                System.out.println("berasal dari Karawang");
            } else if (sub1.contains("AD")) {
                System.out.println("berasal dari Solo");
            } else {
                System.out.println("masukan plat nomor");
            }

            if (angkaBelakang % 2 == 0) {
                System.out.println("Plat tersebut termasuk plat genap");
            } else {
                System.out.println("Plat tersebut termasuk plat ganjil");
            }
        }
    }

    public static void jmlPlat(){
        String[] jmlPlat = new String[]{"Kudus", "Jakarta", "Jogja", "Karawang", "Solo"};

    }

    public static void main(String[] args) {
        inputPlat();
    }
}
