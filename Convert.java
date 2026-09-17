	import java.util.Scanner;
	
	public class Convert {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			//prompt the user and get the value
			System.out.print("temperature in degree Celsius: ");
			double Celsius = input.nextDouble();
			
			//convert and outputthe result
			double Fahrenheit = (Celsius * 9 / 5) + 32;
			System.out.println(Celsius + " C" + " = " + Fahrenheit + " F");

			input.close();
		}
	}

