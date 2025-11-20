public class Task1 {
    
    public static void main(String[] args) {
        
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= Math.pow(i, 2); j++) {
                
                sum++;

            }

            System.out.printf("n = %d -> sum of square = %d\n", i, sum);

        }
    }
}
