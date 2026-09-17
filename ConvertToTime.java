	import java.util.Scanner;
	
	public class ConvertToTime {
		public static void main(String[] args) {
			int seconds, minutes, hours, remainder;
			final int MIN_PER_HOUR = 60;
			final int SEC_PER_MIN = 60;
			Scanner input = new Scanner(System.in);
			
			//prompt the user tp get the value	
			System.out.print("Seconds = ");
			seconds = input.nextInt();
			
			//conversion 
			minutes = seconds / SEC_PER_MIN;
			hours = minutes / MIN_PER_HOUR;
			remainder = seconds % SEC_PER_MIN;
			
			//output
			System.out.printf("%,d s = %,d hrs, %,d min, %,d s", seconds, hours, minutes, remainder);
			
		}
		
	}
	
