package singleton;

public class MainSingleton {

	public static void main(String[] args) {

		Window singleWindow = Window.getInstance();
		singleWindow.open();
		singleWindow.close();
		
	}

}
