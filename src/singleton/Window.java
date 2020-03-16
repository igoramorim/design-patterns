package singleton;

public class Window {
	
	private static Window instance;
	
	private Window() { }
	
	public static synchronized Window getInstance() {
		if (instance == null) {
			instance = new Window();
		}
		return instance;
	}
	
	public void open() {
		System.out.println("Opening window...");
	}
	
	public void close() {
		System.out.println("Closing window...");
	}

}
