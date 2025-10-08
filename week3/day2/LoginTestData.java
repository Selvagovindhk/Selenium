package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("enterusername");

	}
	public void enterPassword() {
		System.out.println("enterpassword");

	}

	public static void main(String[] args) {
		LoginTestData values = new LoginTestData();
		values.enterCredentials();
		values.navigateToHomePage();
		values.enterUsername();
		values.enterPassword();
		

	}

}
