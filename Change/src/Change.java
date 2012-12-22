import java.util.Scanner;


public class Change {
public static void main(String[] args)
{
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter the amount of change: ");
	int change = keyboard.nextInt();
	int q=25;
	int d=10;
	int n=5;
	int p=1;
	int qn=change/q;
	int dn=(change-qn*q)/d;
	int nn=(change-dn*d-qn*q)/n;
	int pn=(change-nn*n-dn*d-qn*q)/p;
	System.out.println("Change: \nQuarters: " + qn + "\nDimes: " + dn + "\nNickles: " + nn + "\nPennies: " + pn);
}
}
