public class Customer{
	
	private String firstName;
	private String lastName;
	private String pin;
	private int accountNumber;
	private double balance;

	public Customer(String firstName, String lastName, String pin, int accountNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.pin = pin;
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
		return this.accountNumber();
	}
	
	

}