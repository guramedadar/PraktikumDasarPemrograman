package UTSbocoranTrial;

import java.util.*;

public class StudiKasus1New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENENTUKAN ANGKA PALING BESAR =====");

        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();
    
        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = sc.nextInt();

        int terbesar = Math.max (Math.max(angka1, angka2), angka3);
        System.out.println(" Nilai terbesar adalah " + terbesar);

}
    
}