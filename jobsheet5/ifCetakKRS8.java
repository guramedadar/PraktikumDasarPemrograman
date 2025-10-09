import java.util.Scanner;
public class ifCetakKRS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Print KRS SIAKAD ---");
        System.out.println("Have the tuition fees been paid in full? (true/false): ");
        boolean ukt_lunas = sc.nextBoolean();

        String message = ukt_lunas ? "UKT payment has been verified. \nKRS now can be printed and you can ask the academic advisor to sign it." 
        : "Registration rejected. Please pay UKT first";
        System.out.println(message);
        }
}
 