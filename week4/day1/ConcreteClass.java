package week4.day1;

public class ConcreteClass extends Abstract{

    @Override
	public void connect() {
		System.out.println("connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}
	public static void main(String[] args) {
		ConcreteClass cc = new ConcreteClass();
		cc.connect();
		cc.disconnect();
		cc.executeUpdate();
		cc.newMethod();

	}

}
