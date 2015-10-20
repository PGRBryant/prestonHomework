package assign416;
import java.util.Scanner;

public class MiltaryTimeTester {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int done = 0;
		while (done == 0) { //just so you can keep testing, for fun
			System.out.print("Enter first military time: ");
			int firstTime = in.nextInt();
			
			System.out.print("Enter second military time: ");
			int secondTime = in.nextInt();
			MilitaryTime militaryTime = new MilitaryTime(firstTime, secondTime);
			
			int diff = militaryTime.timeApart();
			//catch errors
			if (diff == -1) {
				System.out.println("Your input times are incorrectly formatted.");
			} else {
				System.out.println(diff/100 + " hours " + diff%100 + " minutes.");
			}
			
			System.out.print("Enter 0 to try again; else any integer: " );
			done = in.nextInt();
		}	
		
		System.out.println("Have a nice day!");
		in.close(); //cleaner code
	}
}

