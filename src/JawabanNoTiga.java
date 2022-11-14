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
        }
    }

    public static String[] Kudus = new String[50];
    public static String[] Jakarta = new String[50];
    public static String[] Jogja = new String[50];
    public static String[] Karawang = new String[50];
    public static String[] Solo = new String[50];
    public static void jmlPlat(){
        int totPlatNomor = 0;
        int totPlatGenap = 0;
        int totPlatGanjil = 0;

        int totKudus = 0;
        for (int i = 0; i < Kudus.length; i++) {
            if (Kudus[i] != null) {
                totKudus++;
            }
        }
        int totJakarta = 0;
        for (int i = 0; i < Jakarta.length; i++) {
            if (Jakarta[i] != null) {
                totJakarta++;
            }
        }
        int totJogja = 0;
        for (int i = 0; i < Jogja.length; i++) {
            if (Jogja[i] != null) {
                totJogja++;
            }
        }
        int totKarawang = 0;
        for (int i = 0; i < Karawang.length; i++) {
            if (Karawang[i] != null) {
                totKarawang++;
            }
        }
        int totSolo = 0;
        for (int i = 0; i < Solo.length; i++) {
            if (Solo[i] != null) {
                totSolo++;
            }
        }
        totPlatNomor = totJakarta + totJogja + totKarawang + totKudus + totSolo;
        System.out.println("Jumlah semua Plat nomor : " + totPlatNomor);

    }

    public static void main(String[] args) {
        inputPlat();
        //maaf pak cuman bisa segini, selanjutnya saya akan belajar lebih giat lagi
    }
}
