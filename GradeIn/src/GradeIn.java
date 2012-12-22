import java.util.*;
public class GradeIn {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner (System.in);
		int ctr=0;
		String letter="";
		int fail=0;
		int pass=0;
		while(ctr<10){
			System.out.println("Enter the grade of the student: ");
			letter=keyboard.nextLine();
			if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D")) {
				pass=pass+1;
			}
			else if (letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("f")) {
				fail++;
			}
			else {
				System.out.println("bad input, not counted");
				ctr--;
			}
			ctr++;
		}
		System.out.println(pass + " Students Passed.\n" + fail + " Students Failed.");
	}
}
