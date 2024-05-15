import java.util.Scanner;

public class AtmApp{
		
		private String firstName;
		private String lastName;
		private int    Pin;
		private double withdraw;
		private double balance;
		private double transfer;
		private int changePin;
		private double closeAcount;
	


	public Account(String firstName, String lastName, int Pin, double withdraw, double balance, double transfer, int changePin){

		this.firstName = firstName;
		this.lastName = lastName;
		this.pin = pin;
		this.withdraw = withdraw;
		
		if (balance > 0.0){
			this.balance = balance;
		
		}
		
		this.transfer = transfer;
		this.changePin = changePin;
		this.closeAccount = closeAccount;
				

		}

		 public void setFirstName(String FirstName){
			this.firstName = firstName;
		}
		
		public String getFirstName(){
			return firstName;
		}
		 
		public void setLastName(){
			this.lastName = lastName;
		}
		
		
		public String getLastName(){
			return lastName;
		}

		public void setPin(int pin){
			this.pin = Pin;
		}
		
		
		public int getPin(){
			return pin;
		}
		
		public void setCloseAccount(double closeAccount){
			this.closeAccount = closeAccount;
		}	
		  
		public double getCloseAccount(){
			return closeAccount;
		}

		public void setWithdraw(double withdraw){
		    
			if(balance > amount){
			 	balance = balance - amount;
			 }
}
		public double getwithdraw(){
			 return withdraw;
		   }
			
			