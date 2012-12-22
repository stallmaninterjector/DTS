import java.util.*;
public class CoreTech {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("a)	Altering plant genes for school food ");
		System.out.println("b)	Plumbing in the School");
		System.out.println("c)	The promethean board");
		System.out.println("d)	Air heating ducts in the school");
		System.out.println("e)	Converting corn to ethanol in chemistry lab");
		System.out.println("f)	The computers in the lab");
		System.out.println("Application #1: ");
		String a1 = keyboard.nextLine();
		System.out.println("Application #2: ");		
		String a2 = keyboard.nextLine();
		if (a1.equalsIgnoreCase("a") && a2.equalsIgnoreCase("b") || (a1.equalsIgnoreCase("b") && a2.equalsIgnoreCase("a"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("a") && a2.equalsIgnoreCase("c") || (a1.equalsIgnoreCase("c") && a2.equalsIgnoreCase("a"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("a") && a2.equalsIgnoreCase("d") || (a1.equalsIgnoreCase("d") && a2.equalsIgnoreCase("a"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("a") && a2.equalsIgnoreCase("e") || (a1.equalsIgnoreCase("e") && a2.equalsIgnoreCase("a"))) {
			System.out.println("They share Bio-Tech");
		}
		if (a1.equalsIgnoreCase("a") && a2.equalsIgnoreCase("f") || (a1.equalsIgnoreCase("f") && a2.equalsIgnoreCase("a"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("b") && a2.equalsIgnoreCase("c") || (a1.equalsIgnoreCase("c") && a2.equalsIgnoreCase("b"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("b") && a2.equalsIgnoreCase("d") || (a1.equalsIgnoreCase("d") && a2.equalsIgnoreCase("b"))) {
			System.out.println("Structural");
		}
		if (a1.equalsIgnoreCase("b") && a2.equalsIgnoreCase("e") || (a1.equalsIgnoreCase("e") && a2.equalsIgnoreCase("b"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("b") && a2.equalsIgnoreCase("f") || (a1.equalsIgnoreCase("f") && a2.equalsIgnoreCase("b"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("c") && a2.equalsIgnoreCase("d") || (a1.equalsIgnoreCase("d") && a2.equalsIgnoreCase("c"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("c") && a2.equalsIgnoreCase("e") || (a1.equalsIgnoreCase("e") && a2.equalsIgnoreCase("c"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("c") && a2.equalsIgnoreCase("f") || (a1.equalsIgnoreCase("f") && a2.equalsIgnoreCase("c"))) {
			System.out.println("They share Electronic Technology");
		}
		if (a1.equalsIgnoreCase("d") && a2.equalsIgnoreCase("e") || (a1.equalsIgnoreCase("e") && a2.equalsIgnoreCase("d"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("d") && a2.equalsIgnoreCase("f") || (a1.equalsIgnoreCase("f") && a2.equalsIgnoreCase("d"))) {
			System.out.println("No Common Technologies");
		}
		if (a1.equalsIgnoreCase("e") && a2.equalsIgnoreCase("f") || (a1.equalsIgnoreCase("f") && a2.equalsIgnoreCase("e"))) {
			System.out.println("No Common Technologies");
		}
		
	}
}
