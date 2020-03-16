package builder;

public class MainBuilder {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccountBuilder()
				.name("igor")
				.email("email@email")
				.build();
		
		System.out.println(acc1);

	}

}
