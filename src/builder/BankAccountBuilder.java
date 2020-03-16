package builder;

public class BankAccountBuilder {
	
	private String name;
	private String accountNumber;
	private String email;
	private boolean newsletter;
	
	public BankAccountBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public BankAccountBuilder accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}
	
	public BankAccountBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public BankAccountBuilder newsletter(boolean newsletter) {
		this.newsletter = newsletter;
		return this;
	}
	
	public BankAccount build() {
		return new BankAccount(name, accountNumber, email, newsletter);
	}

}
