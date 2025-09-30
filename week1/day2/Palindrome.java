package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 1231;
		int output =0;
		
		for(int i=input; i>0; i/=10) {
			int remainder = i%10;
			output = output*10 + remainder;
			
		}
		if(input == output) {
			System.out.println("It is Palindrome");
			}
		else {
			System.out.println("It is not a Palindrome");
		}
		}
}
		

