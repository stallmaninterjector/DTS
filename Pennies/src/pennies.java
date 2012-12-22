import java.util.*;
public class pennies {
public static void main(String[]args) {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("How many days?");
	int ctr=1;
	int days=keyboard.nextInt();
	double addition=.01;
	double salary=0;
	do{
		addition=addition*2;
		salary=salary+addition;
		ctr++;
	}while(ctr<days);
	salary=salary+.01;
	System.out.println("$"+salary);
}
}
