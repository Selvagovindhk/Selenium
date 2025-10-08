package week3.day2;

public class LoginPage extends BasePage{

	public void performCommonTasks() {
		System.out.println("Overrided");
		super.performCommonTasks();

	}
	public static void main(String[] args) {
		LoginPage lg= new LoginPage();
		lg.performCommonTasks();
	}

}
