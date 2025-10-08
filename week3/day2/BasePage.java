package week3.day2;

public class BasePage {
	
	public void findElement() {
		System.out.println("findElement");

	}
	public void clickElement() {
		System.out.println("clickElement");

	}
	public void enterText() {
		System.out.println("enterText");

	}
	public void performCommonTasks() {
		System.out.println("performCommonTasks");

	}

	public static void main(String[] args) {
		
		BasePage bp = new BasePage();
		bp.performCommonTasks();
	}

}
