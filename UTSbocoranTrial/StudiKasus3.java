package UTSbocoranTrial;

import java.util.Scanner;

public class StudiKasus3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("===== MENGHITUNG TOTAL BONUS =====");
    
    System.out.print("Masukkan nilai kinerja anda: ");
    int nilai = sc.nextInt();

    System.out.print("Masukkan lama bekerja anda (tahun): ");
    int lama = sc.nextInt();

    System.out.print("Masukkan gaji pokok anda: Rp ");
    int gaji = sc.nextInt();

    System.out.print("Apakah anda memiliki sertifikasi? (ya/tidak): ");
    String sertif = sc.next().toLowerCase();

    float bonus; int bonusSertif;

    if (nilai >= 70) {
        if (lama < 2) {
            bonus = (float) (gaji * 0.01);    }
        else if (lama >= 2 && lama < 5) {
            bonus = (float) (gaji * 0.03); }
        else {
            bonus = (float) (gaji * 0.05); } }    
    else if (nilai >= 90) {
        if (lama < 2) {
        bonus = (float) (gaji * 0.02);    }
        else if (lama >= 2 && lama < 5) {
        bonus = (float) (gaji * 0.04); }
        else {
        bonus = (float) (gaji * 0.07); } }
    else {
        bonus = 0; }

    if (sertif.equalsIgnoreCase("ya")) {
        bonusSertif = 500000; }
    else {
        bonusSertif = 0;}
    
    float totGaji = (float) (gaji + bonus + bonusSertif);
    System.out.println("Bonus anda adalah Rp " + bonus);
    System.out.println("Total Bonus & Gaji anda adalah Rp " + totGaji);

    sc.close();
    }
}