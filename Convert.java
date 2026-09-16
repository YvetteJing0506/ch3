	import java.util.Scanner;
	
	public class Convert {
		public static void main(String[] args) {
			
			//trying exercise 3.1
			int x = 365;
			System.out.printf("x = %f", x);
			double y = 3.14;
			System.out.printf("y = %d", y);
			System.out.printf("y = %d" + "y = %f", y);
			//if I run the program, there is no results
			
			
			
			//exercise 3.2 conversion from Celsius to Fahrenheit
			
			//variables declaration
			int Celcius;
			double Fahrenheit;
			double multiply_factor = 9 / 5;
			int addition_value = 32;
			Scanner in = new Scanner(System.in);
			
			//prompt the user and get the value
			System.out.print("What's the temperature in degree Celsius?");
			Celsius = in.nextDouble();
			
			//convert and outputthe result
			Fahrenheit = (Celsius * multiply_factor + addtion_value);
			System.out.println("the temperature in Fahrenheit is: " + Fahrenheit);

		}
	}

