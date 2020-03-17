package factory;

public class MainFactory {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.getShape("CIRCLE");
		circle.draw();
		
		Shape rect = factory.getShape("RECTANGLE");
		rect.draw();
		
		Shape triangle = factory.getShape("TRIANGLE");
		triangle.draw();

	}

}
