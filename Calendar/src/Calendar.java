import java.util.*;
public class Calendar {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("\nWhat number is this month?");
		int month=in.nextInt();
		int days=0;
		if (month==1 || month==3 || month==5 ||month==7||month==8 || month==10 || month==12 ){
			days=31;
		}
		if (month==4 || month==6 || month==9 || month==11) {
			days=30;
		}
		if (month==2) {
			days=28;
		}
		String mo[] ={"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};


		System.out.println("Enter the starting day ( 0 for Sunday) : ");
		int start=in.nextInt();
		System.out.println ("\t\t\t\n\n" + mo[month-1]);
		System.out.println("S\tM\tT\tW\tT\tF\tS\n--------------------------------------------------------------");
		int j=0;
		for (int ctr=1;ctr<=start;ctr++){
			System.out.print("\t");
		}
		for(int i=1;i<=days;i++){
			System.out.print(i + "\t");
			for (j=1;j<=start;j++) {
				if((i+start)%7==0){
					System.out.println();
				}
			}
		}
	}
}
