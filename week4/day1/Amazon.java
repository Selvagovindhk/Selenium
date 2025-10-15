package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("cashOnDelivery");
	}

	@Override
	public void upiPayments() {
		System.out.println("upiPayments");
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments");
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking");
	}

	public static void main(String[] args) {
		Amazon az = new Amazon();
		az.cashOnDelivery();
		az.upiPayments();
		az.cardPayments();
		az.internetBanking();
		az.recordPaymentDetails();
	}
}
