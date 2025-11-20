import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        do {
        	
        	System.out.print("Input n: ");
        	int n = sc.nextInt();

        	if (n < 0) {
        		
        		break;
        		
        	}

        	for (int i = 1; i <= n; i++) {
            
            	for (int j = 1; j <= n; j++) {
                
                	if (n <= 2) {

                		System.out.print(n);

                	} else {

                		if (i == 1 || i == n || j == 1 || j == n) {
                		
                			System.out.print(n);

                		} else {

                			System.out.print(" ");

                		}

                	}
            
            	}

            	System.out.println();

        	}

        } while (true);

        sc.close();

    }
}