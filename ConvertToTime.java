	import java.util.Scanner;
	
	public class ConvertToTime {
		public static void main(String[] args) {
			int seconds, minutes, hours, remainder;
			final int SEC_PER_HOUR = 3600;
			final int SEC_PER_MIN = 60;
			Scanner input = new Scanner(System.in);
			
			//prompt the user tp get the value	
			System.out.print("Seconds = ");
			seconds = input.nextInt();
			
			//conversion calculations
			hours = seconds / SEC_PER_HOUR;
			int sec_left_over = seconds % SEC_PER_HOUR;
			minutes = sec_left_over / SEC_PER_MIN;
			remainder = seconds % SEC_PER_MIN;
			
			//output
			System.out.printf("%,d seconds = %,d hours, %,d minute, %,d seconds", seconds, hours, minutes, remainder);
			
		}
		
	}
	
