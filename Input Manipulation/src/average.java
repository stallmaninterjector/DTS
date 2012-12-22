import java.util.*;
public class average {
public static void main(String[]args){
	Scanner in = new Scanner (System.in);
	int ctr=1;
	int total=0;
	while(ctr<=5){
	System.out.println("Enter a number");
	total=total+in.nextInt();
	ctr++;
	}
	double ave=total/5.0;
	System.out.println("Average: "+ave);
}
}
