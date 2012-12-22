import java.util.*;

public class Commission {
	public static void main(String[]args) {
		double hours;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter hours worked: ");
		hours = keyboard.nextDouble();
		System.out.println("Enter total sales $: ");
		double sales = keyboard.nextDouble();
		double overtimehours=0;
		double regwage = 0;
		if (hours > 40) {
			overtimehours = hours-40;
		regwage = (hours-overtimehours)*7.25;
		}
		if (hours < 40){
		regwage = hours*7.25;
		}
		double com=0;
		if (sales<=99.99) {
			com=sales*.05;
		}
		if (sales>=100 && sales<=299.99) {
			com=sales*.1;
		}
		if (sales>=300) {
			com=sales*.15;
		}
		double overtimewage=overtimehours*7.25*1.5;
		double total=overtimewage+com+regwage;
		//System.out.println(hours);
		System.out.println("Regular Wages: $" + regwage + "\nOvertime Wages: $" + overtimewage + "\nCommission: $" + com + "\n\nTotal Earned: $" + total);

	}

}
