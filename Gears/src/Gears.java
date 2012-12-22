import java.util.*;

public class Gears {


	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("------------------------\n");
		System.out.println("Driver Gear Info\n");
		System.out.println("------------------------\n");	
		System.out.println("Enter diameter in cm: ");
		double driverDiameter=keyboard.nextDouble();
		driverDiameter=driverDiameter-0;
		System.out.println("Enter number of teeth: ");
		double driverTeeth=keyboard.nextDouble();
		System.out.println("Enter speed RPMs: ");
		double driverSpeed=keyboard.nextDouble();
		System.out.println("\n\n\n");
		System.out.println("------------------------\n");
		System.out.println("Follower Gear Info");
		System.out.println("------------------------\n");
		System.out.println("Enter diameter in cm: ");
		double followerDiameter=keyboard.nextDouble();
		followerDiameter=followerDiameter-0;
		System.out.println("Enter number of teeth: ");
		double followerTeeth=keyboard.nextDouble();
		System.out.println("\n\n\n\n");
		System.out.println("------------------------\n");
		System.out.println("Results");
		System.out.println("------------------------\n");
		double ratio = followerTeeth / driverTeeth;
		System.out.println("Gear Ratio: " + ratio);
		double followerSpeed = driverSpeed / ratio;
		System.out.println("Follower RPMs: " + followerSpeed + "RPMs");

	}

}
