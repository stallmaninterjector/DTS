import java.util.Scanner;
public class digdisplay {
	public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a 5 digit integer");
		int bignum = in.nextInt();
		int fivenum=bignum%10;
		System.out.println(fivenum);
		int fournum=bignum%100;
		System.out.println(fournum);
		int threenum=bignum%1000;
		System.out.println(threenum);
		int secnum=bignum%10000;
		System.out.println(secnum);
		int firstnum=bignum%100000;
		System.out.println(firstnum);
		
	}
}
