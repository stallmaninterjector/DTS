
	import java.util.*;
	
public class Volleyball {
	
	public static void main(String[] args)
	{
	
		int players;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of people who want to play: ");
		players = keyboard.nextInt();
		System.out.println();
		
		System.out.print("There number of teams is: ");
		int teams=players/11;
		System.out.println(teams);
		
		System.out.print("The number of players left out: ");
		System.out.println(players%11);
		
	}
}
