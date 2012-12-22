import java.math.*;
public class Fib {
	public static void main(String[]args){
	int ctr=1;
	BigInteger num1 = new BigInteger("1");
	BigInteger num2 = new BigInteger("1");
	BigInteger num1old = new BigInteger("0");
	while (ctr<9999999) {
		System.out.println(num2);
		num1old=num1;
		num1=num2;
		num2=num2.add(num1old);
		ctr++;
	}
}
}
