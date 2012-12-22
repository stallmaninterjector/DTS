import java.util.*;
public class Grade {
	public static void main(String[]args){
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Your current points earned: ");
		double currEarned = keyboard.nextDouble();
		System.out.println("Max points possible: ");
		double currMax = keyboard.nextDouble();
		double oldPer=(currEarned/currMax)*100;
		System.out.println("Points earned on new assignment: ");
		double newEarned = keyboard.nextDouble();
		System.out.println("Points possible on new assignment: ");
		double newMax = keyboard.nextDouble();
		double newPer= ((currEarned+newEarned)/(currMax+newMax))*100;
		oldPer=Math.round(oldPer);
		newPer=Math.round(newPer);
		System.out.println(oldPer + " " + newPer);
		if (newPer > oldPer) {
			System.out.println("Your Grade went up!");
		}
		if (newPer < oldPer) {
			System.out.println("Your Grade went down! :(");
		}
		if (newPer == oldPer) {
			System.out.println("Your Grade stayed about the same.");
		}
	}
}
