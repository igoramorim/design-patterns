package abstractFactory;

public class PrimaryColorFactory extends AbstractFactory {
	
	@Override
	Color getColor(String colorName) {
		
		if ("Blue".equalsIgnoreCase(colorName)) {
			return new Blue();
			
		} else if ("Red".equalsIgnoreCase(colorName)) {
			return new Red();
			
		}
		
		return null;
	}

}
