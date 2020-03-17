package abstractFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String colorType) {
		
		if ("Primary".equalsIgnoreCase(colorType)) {
			return new PrimaryColorFactory();
			
		} else {
			return new SecondaryColorFactory();
		}
		
	}

}
