import java.util.*;
public class Sleepingin {
public static void main(String[]args) {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Are you currently on vacation? (y/n)");
	String vacation=keyboard.nextLine();
	System.out.println("Enter day of week: 1=Sunday, 2=Monday, etc: ");
	int day=keyboard.nextInt();
	if (vacation.equals("y") || vacation.equals("Y")) {
		System.out.println("You can sleep!");
	}
	if (vacation.equals("n") || vacation.equals("N")) {
		if (day == 1 || day == 7) {
			System.out.println("You can Sleep In!");
		}
		if (day > 1 && day < 7){
			System.out.println("can't sleep in");
		}
	}
}
}
