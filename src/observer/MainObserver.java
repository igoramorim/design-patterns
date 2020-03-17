package observer;

public class MainObserver {

	public static void main(String[] args) {

		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new HexaObserver(subject);
		new OctalObserver(subject);
		
		int value = 10;
		System.out.println("Value: " + value);
		subject.setValue(value);
		
		System.out.println("-------------------------------");
		
		value = 15;
		System.out.println("Value: " + value);
		subject.setValue(value);
		
	}

}
