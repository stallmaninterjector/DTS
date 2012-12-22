import java.util.*;
public class GuessingGame {
	public static void main(String[]args){

		Scanner keyboard = new Scanner (System.in);
		Random generator = new Random();
		int num=generator.nextInt(10)+1;
		int guess=0;
		//String again="Y";
		while (guess!=num ) {
			System.out.println("Guess a number");
			guess=keyboard.nextInt();
			if (guess==num){
				System.out.println("Correct!");
				//System.out.println("Run again?(Y/N)");
				//again=keyboard.nextLine();
			} 
			else if (guess>10 || guess<0){
				System.out.println("Stay in the range!");
			}
			else if (guess>num){
				System.out.println("Too high");
			}
			else if (guess<num){
				System.out.println("Too low");
			}

		}
	}
}