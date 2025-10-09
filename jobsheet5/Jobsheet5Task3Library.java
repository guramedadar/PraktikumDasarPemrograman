import java.util.Scanner;
public class Jobsheet5Task3Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- LIBRARY ENTRY GRANTS ---");
        System.out.println("Are you bring your ID? (y/n): ");
        String id = sc.nextLine();

        if (id.equalsIgnoreCase("y")) {
            System.out.println("Your allowed to enter. \nWELCOME TO LIBRARY"); }
        else { System.out.println("Do you have registered online? (y/n): ");
            String reg = sc.nextLine();
            if (reg.equalsIgnoreCase("y")) {
                System.out.println("Your allowed to enter. \nWELCOME TO LIBRARY"); }
            else { 
                System.out.println("Your denied to entry"); }
        }
    }
}
