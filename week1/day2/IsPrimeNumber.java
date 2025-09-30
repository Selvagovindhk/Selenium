package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int a=6;
		boolean isPrime = true;
		
		for(int i=2; i<=a; i++) {
		if(a%i == 0)
		{
			isPrime = false;
			break;
		}
		}
		if(isPrime && a > 1) {
			System.out.println(a+  " is a Prime Number");
		}
		else {
			System.out.println(a+  " is not a Prime Number");
		}

}}