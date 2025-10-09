import java.util.Scanner;
public class nestedUjianSkripsi8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message =  null;

        System.out.println("Has the student been cleared of compensation? (yes/no): ");
        String compensationStatus = sc.nextLine().trim();

        System.out.println("Enter the number of guidance logs with Supervisor 1: ");
        int supervisor1 = sc.nextInt();
        System.out.println("Enter the number of guidance logs with Supervisor 2: ");
        int supervisor2 = sc.nextInt();

        if (compensationStatus.equalsIgnoreCase("yes")) {
            if (supervisor1 >= 8 && supervisor2 >= 4) {
                message = "All requirement are met. The student may register for the thesis exam"; }
            else if (supervisor1 < 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 AND Supervisor 2 fewer than 4."; }
            else if (supervisor1 < 8 && supervisor2 >= 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8."; }
            else if (supervisor1 >= 8 && supervisor2 < 4) {
                message = "Failed: Supervisor 2 fewer than 4."; }
        } else {
            message = "Failed: The student has not been cleared of compensation."; }
          System.out.println(message);
          sc.close();
    }
}



