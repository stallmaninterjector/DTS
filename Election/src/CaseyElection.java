import java.util.Scanner;


public class CaseyElection {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("*************************************************\nThe Maryland Thanks You For Tallying District Data!\n*************************************************\n\nEnter name of candidate #1");
	String candidate1=keyboard.nextLine();
	System.out.println("Enter name of candidate #2");
	String candidate2=keyboard.nextLine();
	System.out.println("Enter name of candidate #3");
	String candidate3=keyboard.nextLine();
	System.out.println("Enter # Rockville Votes for " + candidate1);
	int rvotes1=keyboard.nextInt();
	System.out.println("Enter # Rockville Votes for " + candidate2);
	int rvotes2=keyboard.nextInt();
	System.out.println("Enter # Rockville Votes for " + candidate3);
	int rvotes3=keyboard.nextInt();
	System.out.println("Enter # Bethesda Votes for " + candidate1);
	int bvotes1=keyboard.nextInt();
	System.out.println("Enter # Bethesda Votes for " + candidate2);
	int bvotes2=keyboard.nextInt();
	System.out.println("Enter # Bethesda Votes for " + candidate3);
	int bvotes3=keyboard.nextInt();
	System.out.println("--------------------------------------\nCandidate	        Votes   Percent\n--------------------------------------");
	int total1 = bvotes1 + rvotes1;
	int total2 = bvotes2 + rvotes2;
	int total3 = bvotes3 + rvotes3;
	int allvotes = total1 + total2 + total3;
	double allvotes2=allvotes;
	double per1 = (total1/allvotes2)*100;
	double per2 = (total2/allvotes2)*100;
	double per3 = (total3/allvotes2)*100;
	per1=Math.round(per1);
	per2=Math.round(per2);
	per3=Math.round(per3);
	System.out.println(candidate1 + "\t" + total1 + "\t" + per1 + "\n" + candidate2 + "\t" + total2 + "\t" + per2 + "\n" + candidate3 + "\t" + total3 + "\t" + per3 + "\nThe total votes are:\t" + allvotes);
	}
}
