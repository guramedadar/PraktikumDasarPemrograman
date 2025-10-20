package jobsheet6.UTS;
import java.util.Scanner;
public class CaseMethod1UTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== COLLEGE DATA INPUT =====");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.println("===== 1st Subject: Alghorithms and Programming =====");
        System.out.print("UTS score: ");
        float uts1 = sc.nextFloat();
        System.out.print("UAS score: ");
        float uas1 = sc.nextFloat();
        System.out.print("Task score: ");
        float task1 = sc.nextFloat();
        System.out.println();

        System.out.println("===== 2nd Subject: Data Structure =====");
        System.out.print("UTS score: ");
        float uts2 = sc.nextFloat();
        System.out.print("UAS score: ");
        float uas2 = sc.nextFloat();
        System.out.print("Task score: ");
        float task2 = sc.nextFloat();
        System.out.println();

        System.out.println("===== ACADEMIC ASSESSMENT RESULTS =====");
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println();

        float finalscore1 = uts1 * uas1 * task1 / 3;
        float finalscore2 = uts2 * uas2 * task2 / 3;
        String statussubject1, statussubject2, grade1, grade2;

        if (finalscore1 >= 60) {
            statussubject1 = "PASS";
            
            if (finalscore1 > 80 && finalscore1 <= 100) {
                grade1 = "A";
            } else if (finalscore1 > 73 && finalscore1 <= 80) {
                grade1 = "B+";
            } else if (finalscore1 > 65 && finalscore1 <= 73) {
                grade1 = "B";
            } else if (finalscore1 > 60 && finalscore1 <= 65) {
                grade1 = "C+";
            } else if (finalscore1 > 50 && finalscore1 <= 60) {
                grade1 = "C";
            } else if (finalscore1 > 39 && finalscore1 <= 50) {
                grade1 = "D";
            } else {
                grade1 = "E";
            }
            
        } else {
            statussubject1 = "NOT PASSED";
            
            if (finalscore1 > 80 && finalscore1 <= 100) {
                grade1 = "A";
            } else if (finalscore1 > 73 && finalscore1 <= 80) {
                grade1 = "B+";
            } else if (finalscore1 > 65 && finalscore1 <= 73) {
                grade1 = "B";
            } else if (finalscore1 > 60 && finalscore1 <= 65) {
                grade1 = "C+";
            } else if (finalscore1 > 50 && finalscore1 <= 60) {
                grade1 = "C";
            } else if (finalscore1 > 39 && finalscore1 <= 50) {
                grade1 = "D";
            } else {
                grade1 = "E";
            }
        }
        
        if (finalscore2 >= 60) {
            statussubject2 = "PASS";
            
            if (finalscore2 > 80 && finalscore2 <= 100) {
                grade2 = "A";
            } else if (finalscore2 > 73 && finalscore2 <= 80) {
                grade2 = "B+";
            } else if (finalscore2 > 65 && finalscore2 <= 73) {
                grade2 = "B";
            } else if (finalscore2 > 60 && finalscore2 <= 65) {
                grade2 = "C+";
            } else if (finalscore2 > 50 && finalscore2 <= 60) {
                grade2 = "C";
            } else if (finalscore2 > 39 && finalscore2 <= 50) {
                grade2 = "D";
            } else {
                grade2 = "E";
            }
            
        } else {
            statussubject2 = "NOT PASSED";
            
            if (finalscore2 > 80 && finalscore2 <= 100) {
                grade2 = "A";
            } else if (finalscore2 > 73 && finalscore2 <= 80) {
                grade2 = "B+";
            } else if (finalscore2 > 65 && finalscore2 <= 73) {
                grade2 = "B";
            } else if (finalscore2 > 60 && finalscore2 <= 65) {
                grade2 = "C+";
            } else if (finalscore2 > 50 && finalscore2 <= 60) {
                grade2 = "C";
            } else if (finalscore2 > 39 && finalscore2 <= 50) {
                grade2 = "D";
            } else {
                grade2 = "E";
            }
        }

        float finalScoreSemester = finalscore1 * finalscore2 / 2;
        String statusSemester;

        if (finalScoreSemester >= 70) {
            statusSemester = "PASS (Average >= 70)";
        } else {
            statusSemester = "NOT PASSED (Average < 70)";
        }

        System.out.println("Subject\t\t\t\t\t\t\t\t\t\t\t\t\tUTS\t\t\tUAS\t\t\tTask\t\t\tFinal Score\t\t\tGrade\t\t\tStatus");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Programming Algorithms\t\t\t%f\t\t\t%f\t\t\t%f\t\t\t%f\t\t\t%s\t\t\t%s\n", uts1, uas1, task1, finalscore1, grade1, statussubject1);
        System.out.printf("Data Structure\t\t\t\t\t\t\t%f\t\t\t%f\t\t\t%f\t\t\t%f\t\t\t%s\t\t\t%s\n\n", uts2, uas2, task2, finalscore2, grade2, statussubject2);

        System.out.println("Average final grade: " + finalScoreSemester);
        System.out.println("Semester status: " + statusSemester);

        sc.close();
    }
}
