import java.util.Scanner;


public class Woot2 {
public static void main(String[]args) {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter your Username:");
	String Uname = keyboard.nextLine();
	System.out.println("Enter your Password:");
	String pword = keyboard.nextLine();
	if (Uname.equals("HexBeetle75"))
	{
		if (pword.equals("invasivespecies"))
		{
			System.out.println("Welcome, " + Uname);
		}

		else
		{
			System.out.println("Sorry, wrong password");
		}
	}
	if (Uname.equals("SparklePony10"))
	{
		if (pword.equals("glitterific!"))
		{
			System.out.println("Welcome, " + Uname);
		}

		else
		{
			System.out.println("Sorry, wrong password");
		}
	}
	if (Uname.equals("PetPet"))
	{
		if (pword.equals("particardi"))
		{
			System.out.println("Welcome, " + Uname);
		}

		else
		{
			System.out.println("Sorry, wrong password");
		}
	}
	else 
		System.out.println("That username doesn't exist...");
}
}
