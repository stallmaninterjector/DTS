import java.util.*;
public class Monkey {
public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Monkey 1 smiling? y/n: ");
	String m1 = keyboard.nextLine();
	System.out.println("Monkey 2 smiling? y/n: ");
	String m2 = keyboard.nextLine();
	if (m1.equalsIgnoreCase("y") && m2.equalsIgnoreCase("y")) {
		System.out.println("They're up to something!");
	}
	if (m1.equalsIgnoreCase("y") && m2.equalsIgnoreCase("n")) {
		System.out.println("We're okay for now");
	}
	if (m1.equalsIgnoreCase("n") && m2.equalsIgnoreCase("n")) {
		System.out.println("Something has upset them. BEWARE!");
	}
	if (m1.equalsIgnoreCase("n") && m2.equalsIgnoreCase("y")) {
		System.out.println("We're okay for now");
	}
}
}
