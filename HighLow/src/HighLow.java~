import java.util.*;
public class Casey_HighLow {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Think of a number from 1 - 100");
		String status="";
		int count=0;
		int guess=100;
		while(!(status.equalsIgnoreCase("C"))) {
			//guess=(1+guess)/2;
			System.out.println("Is the number " + guess + " Correct, High, Low?");
			status=keyboard.nextLine();;;
			if (status.equalsIgnoreCase("H")) {
				guess=(1+guess)/2;
			}
			if (status.equalsIgnoreCase("L")) {
				guess=guess/2+guess;
			}
			if (status.equalsIgnoreCase("C")) {
				System.out.println("Hooray!");
			}
			count++;
		}
		System.out.println("It took " + count + " tries");
	}
}
