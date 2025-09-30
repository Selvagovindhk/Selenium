package week3.day2;

public class AssignmentReverseString {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		char[] cs = companyName.toCharArray();
		for (int i = cs.length-1; i >= 0; i--) {
			System.out.println(cs[i]);
		}
	}

}
