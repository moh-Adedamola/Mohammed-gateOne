import java.util.Scanner;
import java.util.ArrayList;

public class AtmApp{
	
    private static ArrayList<CustomerDetails> customers = new ArrayList<>();

    private static int accountNumber;

    public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	boolean condition = true;

	while(condition){

		System.out.println("WELCOME TO BANKE ATM");

		System.out.println("WHAT WOULD YOU LIKE TO DO");

		System.out.println("1. Create Account");

		System.out.println("2. Deposit");

		System.out.println("3. Withdraw");

		System.out.println("4. Check Balance");

		System.out.println("5. Transfer");

		System.out.println("6. Change pin");

		System.out.println("7. Close Account");

		System.out.println("8. ExitApp");

		System.out.println();
		

		String response = scanner.nextLine();
		
		switch(response){
			case "1": createAccount();
				  break;

			case "2": deposit();
				  break;

			//case "3": withdraw();
				    

			case "4": checkBalance();
					break;
				    
			//case "5": transfer();

			case "6": changePin();
					break;	
			//case "7": closeAccount();

			case "8": condition = false;

				  System.out.println("Have a nice day");
				  break;

			default : System.out.println("Enter a valid response");
		}
	
	}
    }


	public static void createAccount(){

		Scanner scanner = new Scanner(System.in);

		accountNumber++;

		System.out.print("Enter first name: ");

		String firstName = scanner.nextLine();

		System.out.print("Enter last name: ");

		String lastName = scanner.nextLine();

		System.out.print("Enter pin: ");

		String pin = scanner.nextLine();			

		CustomerDetails customer = new CustomerDetails(firstName, lastName, pin, accountNumber );

		customers.add(customer);

		System.out.println("Account created successfully");

		System.out.println("You account number is " + accountNumber);
	}
	
	public static void deposit(){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number: ");

		int accountNumber = scanner.nextInt();
		
		System.out.print("Enter deposit amount: ");

		double amount = scanner.nextDouble();

		for (int count = 0; count < customers.size(); count++){

			if (customers.get(count).getAccountNumber() == accountNumber){

				customers.get(count).deposit(amount);

				System.out.println(amount + " deposited successfully");
			}
		}
	}

	/*public static void withdraw(){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number: ");

		int accountNumber = scanner.nextInt();
		
		System.out.print("Enter withdraw amount: ");

		double amount = scanner.nextDouble();

		for (int count = 0; count < customers.size(); count++){

			 if (customers.get(count).getAccountNumber() == accountNumber && customers.get(count).getPin().equals(pin)) {

				customers.get(count).withdraw(amount);

				System.out.println(amount + " withdrawn successfully");
			}
		
			else {
				System.out.println("Insufficient funds");

			}
		}
	}*/

	public static void checkBalance(){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number: ");

		int accountNumber = scanner.nextInt();

		scanner.nextLine();		

		System.out.print("Enter pin: ");

		String pin = scanner.nextLine();

		for (int count = 0; count < customers.size(); count++){

			if (customers.get(count).getAccountNumber() == accountNumber && customers.get(count).getPin().equals(pin)){

				System.out.println("You account balance is " + customers.get(count).getBalance());
			}
		}
	}

	public static void changePin(){

    		Scanner scanner = new Scanner(System.in);

   		System.out.print("Enter account number: ");

   		int accountNumber = scanner.nextInt();

    		scanner.nextLine(); 

    		System.out.print("Enter current pin: ");

    		String currentPin = scanner.nextLine();

    		System.out.print("Enter new pin: ");

    		String newPin = scanner.nextLine();

    		for (int count = 0; count < customers.size(); count++){

        		if (customers.get(count).getAccountNumber() == accountNumber && customers.get(count).getPin().equals(currentPin)){

            			customers.get(count).setPin(newPin);

            			System.out.println("Pin changed successfully");
            
        		}

			else {

				System.out.println("Enter the correct pin!");

			}
    		}
  
	}

	/*public static void transfer(){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter sender's account number: ");

		int senderAccountNumber = scanner.nextInt();

		scanner.nextLine();		

		System.out.print("Enter pin: ");

		String pin = scanner.nextLine();

		System.out.print("Enter receiver's account number: ");
	
		int receiversAccountNumber = scanner.nextInt();
		


		
	}*/
}