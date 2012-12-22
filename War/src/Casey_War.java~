import java.util.*;
public class Casey_War {
public static void main(String[]args) {
	Scanner in = new Scanner (System.in);
	Random generator = new Random();
	System.out.println("I declare war! Ready to play?");
	in.nextLine();
	int ctr=1;
	int pwins=0;
	int cwins=0;
	int tie=0;
	while (ctr<=10) {
		int pguess=generator.nextInt(14-1)+1;
		int cguess=generator.nextInt(14-1)+1;
		System.out.print("Round #"+ctr+": Player: "+pguess+" Computer: "+cguess+" - ");
		if (cguess>pguess) {
			cwins++;
			System.out.println("Computer Wins!");
		}
		if (cguess<pguess) {
			pwins++;
			System.out.println("Person Wins!");
		}
		if (cguess==pguess) {
			tie++;
			System.out.println("Tie!");
		}
		ctr++;
	}
	System.out.println("---------------\nOverall Stats:\nTies:          "+tie+"\nPeople Wins:   "+pwins+"\nComputer Wins: "+cwins);
}
}
