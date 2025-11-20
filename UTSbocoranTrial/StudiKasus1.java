package UTSbocoranTrial;

import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("===== MENENTUKAN ANGKA PALING BESAR =====");

    System.out.print("Masukkan angka pertama: ");
    int angka1 = sc.nextInt();
    
    System.out.print("Masukkan angka kedua: ");
    int angka2 = sc.nextInt();

    System.out.print("Masukkan angka ketiga: ");
    int angka3 = sc.nextInt();

    if (angka1 > angka2 && angka1 > angka3) {
        System.out.printf("Angka terbesar adalah angka %d \n", angka1); }
    else if (angka2 > angka1 && angka2 > angka3) {
        System.out.printf("Angka terbesar adalah angka %d \n", angka2); }
    else if (angka3 > angka1 && angka3 > angka2) {
        System.out.printf("Angka terbesar adalah angka %d \n", angka3); } 
    else if (angka1 > angka3 && angka2 > angka3 && angka1 == angka2) {
        System.out.printf("Angka terbesar adalah angka %d \n", angka1); }
    else if (angka1 > angka2 && angka3 > angka2 && angka1 == angka3) {
        System.out.printf("Angka terbesar adalah angka %d  \n", angka1); }
    else if (angka2 > angka1 && angka3 > angka1 && angka2 == angka3) {
        System.out.printf("Angka terbesar adalah angka %d  \n", angka2); }
    else {
        System.out.printf("Angka terbesar adalah angka %d \n", angka1); }
    
    sc.close();
    }
}