package UTSbocoranTrial;
import java.util.Scanner;
public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENGHITUNG BMI =====");
        System.out.print("Masukkan berat badan anda (kg): ");
        float berat = (float) sc.nextFloat();

        System.out.print("Masukkan tinggi anda (meter): ");
        float tinggi = (float) sc.nextFloat();

        float bmi;
        bmi = (float) (berat / Math.pow(tinggi, 2));

        if (bmi < 18.5) {
            System.out.printf("Nilai BMI anda adalah: %f\n", bmi);
            System.out.println("Kategori: Kurang berat badan");
            System.out.println("Risiko kesehatan: Kekurangan gizi, osteoporosis, dan penurunan sistem kekbalan tubuh"); }
        
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.printf("Nilai BMI anda adalah: %f\n", bmi);
            System.out.println("Kategori: Berat badan normal");
            System.out.println("Risiko kesehatan: Relatif rendah"); }
        
        else if (bmi >= 25 && bmi < 30) {
            System.out.printf("Nilai BMI anda adalah: %f\n", bmi);
            System.out.println("Kategori: Kelebihan berat badan");
            System.out.println("Risiko kesehatan: Meningkatnya risiko penyakit jantung, diabetes, dan tekanan darah tinggi");}
        
        else {
            System.out.printf("Nilai BMI anda adalah: %f\n", bmi);
            System.out.println("Kategori: Obesitas");
            System.out.println("Risiko kesehatan: Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker");}

        sc.close();        
    }
}
