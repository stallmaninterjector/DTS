import java.util.Scanner;


public class CaseyEaster {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int year=keyboard.nextInt();
		int a=year%19;
		int b=year/100;
		int c=year%100;
		int d=b/4;
		int e=b%4;
		int f=(b+8)/25;
		int g=(b-f+1)/3;
		int h=(19*a+b-d-g+15)%30;
		int i=c/4;
		int k=c%4;
		int r=(32+2*e+2*i-h-k)/7;
		int m=(a+11*h+22*r)/451;
		int n=(h+r-7*m+144)/31;
		int p=(h+r-7*m+144)%31;
		//int day=++p;
		System.out.println(a + " " +  b + " " +   c + " " +  d + " " +  e + " " +  f + " " + g + " " + h + " " + i + " " + k + " " + r + " " + m + " " + n + " " + p);
		String [] months ={"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug" , "Sep", "Oct", "Nov", "Dec"}; 	
		System.out.println( "Easter will be on " + months[(int) (n -1)]+ " " + (p + 2) );

	}
}
