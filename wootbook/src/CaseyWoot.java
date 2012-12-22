import java.util.*;
public class CaseyWoot {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter your Username:");
		String Uname = keyboard.nextLine();
		System.out.println("Enter your Password:");
		String pword = keyboard.nextLine();
		if (Uname.equals("Richard"))
		{
			if (pword.equals("Stallman"))
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
