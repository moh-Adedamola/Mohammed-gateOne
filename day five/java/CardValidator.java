import java.util.Scanner;
public class CardValidator{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter A Card Number: ");

	String cardNumber = scanner.nextLine();

	System.out.print("Card Number Is Valid");


	}

	public static boolean isValid(long number){

	return (getSizenumber)

	getSize(number) == 16) && (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6));
			
	}

	
	
	
	}












}