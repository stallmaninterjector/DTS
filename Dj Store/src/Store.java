import java.util.Scanner;


public class Store {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("*************** Welcome to the DJ Emporium ******************\nEnter the number of records you wish to purchase: \nfor Marcia Griffith- Electric Slide: $11.99");
		int eSlide=keyboard.nextInt();
		System.out.printf("for ABBA- Dancing Queen: $9.99\n");
		int dQueen=keyboard.nextInt();
		System.out.println("for Irene Cara- Flash Dance: $7.99");
		int fDance=keyboard.nextInt();
		double eSlideCost=11.99*eSlide;
		double dQueenCost=9.99*dQueen;
		double fDanceCost=7.99*fDance;
		double total=eSlideCost + dQueenCost + fDanceCost;
		System.out.println("Total Sale: $" + total);
		System.out.println("Amount Tendered: ");
		double payment = keyboard.nextDouble();
		double change=payment-total;
		System.out.println("Your change: $" + change);
	}
}

