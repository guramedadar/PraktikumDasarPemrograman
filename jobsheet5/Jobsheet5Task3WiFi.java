import java.util.Scanner;
public class Jobsheet5Task3WiFi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- WiFi ACCESS ---");
        System.out.print("What status user are you?: ");
        String user = sc.next().toLowerCase();

        if (user.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Input your credits: ");
            int credits = sc.nextInt();
            if (credits >= 12) {
                System.out.println("WiFi access granted (active student), enjoy :)"); }
            else {
                System.out.println("Acces denied, your credits are less than 12"); }
        } else if (user.equalsIgnoreCase("dosen")) {
            System.out.println("Wifi access granted (lecturer)"); }
        else {
            System.out.println("Access denied"); }
    }
}
