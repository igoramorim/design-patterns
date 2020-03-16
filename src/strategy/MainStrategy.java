package strategy;

public class MainStrategy {

	public static void main(String[] args) {

		Strategy[] strategies = {new AddOperation(), new MultiplyOperation()};
		
		for (Strategy strategy : strategies) {
			strategy.operation(10, 5);
		}
		
	}

}
