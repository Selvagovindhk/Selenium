package week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("ENDPOINT");

	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("ENDPOINT, REQUESTBODY, REQUESTSTATUS");

	}
	

	public static void main(String[] args) {
		APIClient ac = new APIClient();
		ac.sendRequest(null);
		//ac.sendRequest(null, null, false);
	}

}
