import java.util.*;
public class NewDJ {
public static void main(String[]args) {
	Scanner in = new Scanner (System.in);
	System.out.println("*********************** Welcome to the DJ Emporium *************************\nWe have the following albums:\nA.	Reasonable Doubt\nB.	Houses of the Holy\nC.	The Wall\nD.	Late Registration\nE.	Fearless\n");
	int ctr=1;
	double classicmoney=0;
	double rapmoney=0;
	double countrymoney=0;
	String again="";
	String choice="";
	while(ctr<15 && !again.equals("N")) {
		System.out.println("Enter album #"+ctr+" you would like to purchase:  ");
		choice=in.nextLine();
		if (choice.equalsIgnoreCase("A")) {
			rapmoney=rapmoney+12.99;
		}
		if (choice.equalsIgnoreCase("B")) {
			classicmoney=classicmoney+9.99;
		}
		if (choice.equalsIgnoreCase("C")) {
			classicmoney=classicmoney+14.99;
		}
		if (choice.equalsIgnoreCase("D")) {
			rapmoney=rapmoney+10.99;
		}
		if (choice.equalsIgnoreCase("E")) {
			countrymoney=countrymoney+3.99;
		}
		ctr++;
		System.out.println("Would you like to make another purchase?  (Y/N): ");
		again=in.nextLine();
	}
	double total=classicmoney+rapmoney+countrymoney;
	System.out.println("Total: $"+total);
	double classicper=(classicmoney/total)*100;
	double rapper=(rapmoney/total)*100;
	double countryper=(countrymoney/total)*100;
	System.out.println(classicper+"% of purchase is Classic Rock music.\n"+rapper+"% of purchase is Hip-Hop music.\n"+countryper+"% of purchase is Country music.");
}
}
