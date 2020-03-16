package builder;

public class BankAccount {
	
	private String name;
	private String accountNumber;
	private String email;
	private boolean newsletter;

	public BankAccount(String name, String accountNumber, String email, boolean newsletter) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.email = email;
		this.newsletter = newsletter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", email=" + email + ", newsletter="
				+ newsletter + "]";
	}
	
}
