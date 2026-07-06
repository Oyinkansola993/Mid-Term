package QUESTION1;
import java.util.Scanner;
public class QUESTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        // Ask the mother for the amount of milk
	        System.out.print("How many oz of milk did the child drink? ");
	        double milk = input.nextDouble();

	        // Determine how long the baby will sleep
	        if (milk >= 6) {
	            System.out.println("Baby will sleep well for 5 hours");
	        } else {
	            System.out.println("Baby will not sleep well. So be prepared");
	        }

	        input.close();
	}

}
