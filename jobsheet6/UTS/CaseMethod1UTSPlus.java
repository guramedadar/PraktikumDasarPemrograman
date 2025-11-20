package jobsheet6.UTS;
import java.util.Scanner;

public class CaseMethod1UTSPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("===== COLLEGE DATA INPUT =====");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.println();

        // Input mata kuliah 1
        System.out.println("===== 1st Subject: Algorithms and Programming =====");
        float[] scores1 = inputScores(sc);
        System.out.println();

        // Input mata kuliah 2
        System.out.println("===== 2nd Subject: Data Structure =====");
        float[] scores2 = inputScores(sc);
        System.out.println();

        // Hitung nilai akhir
        float finalScore1 = calculateAverage(scores1);
        float finalScore2 = calculateAverage(scores2);

        // Tentukan grade dan status
        String grade1 = getGrade(finalScore1);
        String grade2 = getGrade(finalScore2);
        String status1 = getStatus(finalScore1);
        String status2 = getStatus(finalScore2);

        // Hitung rata-rata semester
        float semesterAvg = (finalScore1 + finalScore2) / 2;
        String semesterStatus = semesterAvg >= 70 ? 
            "PASS (Average >= 70)" : "NOT PASSED (Average < 70)";

        // Tampilkan hasil
        System.out.println("===== ACADEMIC ASSESSMENT RESULTS =====");
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println();
        System.out.println("Subject\t\t\t\tUTS\tUAS\tTask\tFinal\tGrade\tStatus");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("Programming Algorithms\t\t%.2f\t%.2f\t%.2f\t%.2f\t%s\t%s\n", 
            scores1[0], scores1[1], scores1[2], finalScore1, grade1, status1);
        System.out.printf("Data Structure\t\t\t%.2f\t%.2f\t%.2f\t%.2f\t%s\t%s\n\n", 
            scores2[0], scores2[1], scores2[2], finalScore2, grade2, status2);
        System.out.printf("Average final grade: %.2f\n", semesterAvg);
        System.out.println("Semester status: " + semesterStatus);

        sc.close();
    }

    // Method untuk input nilai
    private static float[] inputScores(Scanner sc) {
        System.out.print("UTS score: ");
        float uts = sc.nextFloat();
        System.out.print("UAS score: ");
        float uas = sc.nextFloat();
        System.out.print("Task score: ");
        float task = sc.nextFloat();
        return new float[]{uts, uas, task};
    }

    // Method untuk menghitung rata-rata
    private static float calculateAverage(float[] scores) {
        float sum = 0;
        for (float score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    // Method untuk menentukan grade
    private static String getGrade(float score) {
        if (score > 80 && score <= 100) return "A";
        if (score > 73 && score <= 80) return "B+";
        if (score > 65 && score <= 73) return "B";
        if (score > 60 && score <= 65) return "C+";
        if (score > 50 && score <= 60) return "C";
        if (score > 39 && score <= 50) return "D";
        return "E";
    }

    // Method untuk menentukan status
    private static String getStatus(float score) {
        return score >= 60 ? "PASS" : "NOT PASSED";
    }
}