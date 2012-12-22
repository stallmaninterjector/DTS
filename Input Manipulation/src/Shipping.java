
import java.util.Scanner;
public class Shipping {
public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the weight of the item: ");
		double weight=in.nextDouble();
		System.out.println("Enter the cost of shipping per pound");
		double ship=in.nextDouble();
		double shipcost=ship*weight;
		shipcost+=.005;
		shipcost=shipcost*100;
		shipcost=(int)shipcost;
		shipcost=(double)shipcost;
		shipcost/=100;
		System.out.println(shipcost);
		
}
}