package abstractFactory;

public class MainAbstractFactory {

	public static void main(String[] args) {
		
		AbstractFactory primaryFactory = FactoryProducer.getFactory("Primary");

		Color red = primaryFactory.getColor("Red");
		red.paint();
		
		Color blue = primaryFactory.getColor("Blue");
		blue.paint();
		
		//////////////////////////
		
		AbstractFactory secondaryFactory = FactoryProducer.getFactory("Secondary");
		
		Color green = secondaryFactory.getColor("Green");
		green.paint();
		
	}

}
