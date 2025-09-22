package week2.day1;

public class Browser {
	
	public void launchBrowser(String browserName) {
		System.out.println(browserName);

	}
	public void loadUrl() {
		System.out.println("Url loaded successfully");

	}

	public static void main(String[] args) {
		Browser br = new Browser();
		br.launchBrowser("Chrome");
		br.loadUrl();

	}

}
