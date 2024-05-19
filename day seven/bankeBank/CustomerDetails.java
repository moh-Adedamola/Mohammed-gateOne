public class CustomerDetails{
	
	private String firstName;
	private String lastName;
	private String pin;
	private int accountNumber;
	private double balance;

	public CustomerDetails(String firstName, String lastName, String pin, int accountNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.pin = pin;
		this.accountNumber = accountNumber;
		
	}
	
	public void setFirstName(String firstName){	
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setLastName(String firstName){	
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public void setPin(String pin){	
		this.pin = pin;
	}
	
	public String getPin(){
		return this.pin;
	}
	
	public double getBalance(){
		return this.balance;	
	}

	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber(){
		return this.accountNumber;
	}
	
	public void deposit(double amount){
		if (amount > 0){
			this.balance += amount;	
		}
	}

	public void withdraw(double amount){
		if (balance >= amount){
			this.balance = balance - amount;
	
		}

	}		

}