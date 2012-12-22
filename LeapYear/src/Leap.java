import java.util.*;
public class Leap {
public static void main(String[]args) {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter a year to test: ");
	int year = keyboard.nextInt();
	if (year%4==0) {
		if (year%100==0){
			if (year%400==0){
				System.out.println("It's a leap year!");
			}
			System.out.println("It's not a leap year!");
		}
		else {
			System.out.println("It's a leap year!");
		}
	}
	else {
		System.out.println("It's not a leap year!");
	}
}
}
