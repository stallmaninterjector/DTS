import java.util.*;
public class CaseyTaxes {
	public static void main(String[]args){
		Scanner keyboard = new Scanner (System.in);

		System.out.println("Exempt? (Y/N): ");
		String exempt = keyboard.nextLine();

		System.out.println("Enter hours worked: ");
		int hours = keyboard.nextInt();

		System.out.println("Enter hourly rate: ");
		double rate = keyboard.nextDouble();

		System.out.println("");
		double gross=rate*hours;
		System.out.println("Gross wages = $" + gross);

		if (exempt.equals("N"))
		{
			double wageAfterTax=gross-(gross*.18);
			System.out.println("Wages after Taxes: " + wageAfterTax);
		}

		if (exempt.equals("Y"))
		{
			System.out.println("NO TAXES DEDUCTED");
		}
	}
}
