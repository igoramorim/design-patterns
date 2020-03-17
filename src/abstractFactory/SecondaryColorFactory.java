package abstractFactory;

public class SecondaryColorFactory extends AbstractFactory {
	
	@Override
	Color getColor(String colorName) {
		
		if ("Green".equalsIgnoreCase(colorName)) {
			return new Green();
		}
		
		return null;
	}

}
