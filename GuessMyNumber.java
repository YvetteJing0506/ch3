import java.util.Scanner;
import java.util.Random;

	public class GuessMyNumber {
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			// pick a random number
			Random random = new Random();
			int number = random.nextInt(100) + 1;
			
			// prompt the user to get their guess
			System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
			System.out.print("Type a number: ");
			int guess = input.nextInt();
			
			//output
			System.out.println("The number I was thinking of is: " + number);
			System.out.println("You were off by: " + Math.abs(number - guess));
			
		}
	}
