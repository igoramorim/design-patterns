package strategy;

public class AddOperation implements Strategy {

	@Override
	public void operation(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
}
