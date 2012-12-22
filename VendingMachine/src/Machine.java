import java.util.*;
public class Machine {
public static void main(String[]args) {
	Scanner keyboard = new Scanner (System.in);
	double val=0;
	System.out.println("What number do you want to buy?");
	int selection=keyboard.nextInt();
	double diff=0.0;
	double change;
	if (selection==1){
	val=1.25;	
	}
	if (selection==2 || selection==6 || selection==4){
	val=.75;	
	}
	if (selection==3){
	val=.90;	
	}
	if (selection==5){
	val=1.5;	
	}
	System.out.println("Enter the amount paid: ");
	double amt=keyboard.nextDouble();
	if (amt<val){
		diff=val-amt;
		System.out.println("You need to insert $" + diff);
	}
	if (amt>val) {
		change=amt-val;
		System.out.println("Thanks for shoping! your change is: " + change);
	}
}
}
