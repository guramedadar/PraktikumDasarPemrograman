import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int totOrder = 0, totCustomer = 0;
        
        System.out.print("Number of cafe branches: ");
        int cafe = sc.nextInt();

        System.out.println("\n=== Sales Input per Branch ===\n");

        for (int i = 1; i <= cafe; i++) {

        	System.out.printf("--- Branch %d ---\n", i);

        	System.out.print("Number of customers: ");
        	int customer = sc.nextInt();

        	totCustomer += customer;

        	int orderBranch = 0;
        	for (int j = 1; j <= customer; j++) {
        	    
        	    System.out.printf("How many items did Customer %d order? ", j);
        	    int order = sc.nextInt();

        	    orderBranch += order;
        	    totOrder += order;

        	}

        	System.out.printf("Branch %d:\n", i);

        	System.out.printf("Customers: %d people\n", customer);
        	System.out.println("Sold item: " + orderBranch + "\n");

        }

        System.out.println("Total of all branches:");
        System.out.println("Customers: " + totCustomer + " people");
        System.out.println("Sold item: " + totOrder + " item");

        sc.close();

    }
}