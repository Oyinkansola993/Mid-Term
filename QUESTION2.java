package qUESTION2;
import java.util.Scanner;
public class QUESTION2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Get the price of the sale item
        System.out.print("Enter the price of the sale item: ");
        double price = input.nextDouble();

        // Get the shipping state
        System.out.print("Enter the shipping state (TX, LA, CA, etc.): ");
        String state = input.next().toUpperCase();

        // Determine the shipping tax
        if (state.equals("TX") || state.equals("LA")) {
            System.out.println("Shipping Tax: $1.25");
        } else if (state.equals("CA")) {
            System.out.println("Shipping Tax: $3.25");
        } else {
            System.out.println("Shipping Tax: $0.50");
        }

        input.close();
	}

}
