import java.util.Scanner;
public class Jobsheet5Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CHECK THE NUMBER IS ODD OR EVEN ---");
        System.out.print("Input a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even"); }
        else {
            System.out.println("The number is odd"); }
    }
}
