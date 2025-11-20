import java.util.Scanner;

public class GroupScore {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int score,
        	groupHighest = 0;
        float averageScore, totScore, 
        	  highest = 0;


        int i = 1;
        while (i <= 6) {
            
            System.out.println("Group " + i);

            totScore = 0;
        	for (int j = 1; j <= 5; j++) {
            	
            	System.out.printf("  The value of the assessment group %d: ", j);
            	score = sc.nextInt();

            	totScore += score;

        	}

        	averageScore = totScore / 5;
        	System.out.printf("Group %d: Average score: %.1f\n", i, averageScore);

        	if (averageScore > highest) {
        		
        		highest = averageScore;
        		groupHighest = i;

        	}

        	i++;

        }

        System.out.printf("The highest average score is: %.1f from Group: %d", highest, groupHighest);

        sc.close();

    }
}
