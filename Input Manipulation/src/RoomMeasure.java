import java.util.*;
public class RoomMeasure {
public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the room's height: ");
		double height=in.nextDouble();
		System.out.println("Enter the room's length: ");
		double length=in.nextDouble();
		System.out.println("Enter the room's width: ");
		double width=in.nextDouble();
		double sil=length*width;
		double wall1=width*height;
		double wall2=length*height;
		double floor=sil;
		System.out.println("Floor: "+floor+"ft\nCeiling: "+sil+"ft\nShort Wall: "+wall1+"ft\nLong Wall: "+wall2+"ft");
}
}