import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


	public class CheckOutSystem{
	
		public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		double total = 1;
		double subTotal = 0;


		ArrayList<String> items = new ArrayList<>();
		ArrayList<Double> quantity = new ArrayList<>();
		ArrayList<Double> price = new ArrayList<>();
		ArrayList<Double> totals = new ArrayList<>();

		
		System.out.println("What is the customer's name: ?");
		String customerName = input.nextLine();
			
		String userResponse = "";
			
		Date date = new Date();

		do{		
			

			System.out.println("What did the user buy: ?");
			String itemBought = input.next();
			
			System.out.println("How many pieces of goods: ?");
			double numberOfPieces  = input.nextInt();

			System.out.println("How much per unit: ?");
			double pricePerUnit = input. nextInt();

			System.out.println("Add more items: ?");
			userResponse = input.next();
			
			total = numberOfPieces * pricePerUnit;
			items.add(itemBought);
			quantity.add(numberOfPieces);
			price.add(pricePerUnit);
			totals.add(total);

		}while(!userResponse.equals("no"));
			
		System.out.println("What is your name:?");
		String cashierName = input.next();
		System.out.println("How much discount will he get: ");
		int discountGiven = input.nextInt();
		
			System.out.println("SEMICOLON STORES ");
			System.out.println("MAIN BRANCH ");
			System.out.println("LOCATION :  312, HERBERT MACAULAY WAY, SABO YABO, LAGOS");
			System.out.println("TEL: 03293828343 ");
			System.out.println(date);
			System.out.println("Cashier:  " + cashierName);
			System.out.println("Customer's Name:  " + customerName);

		System.out.println("=================================");
		System.out.println("ITEM \t QTY \t PRICE \t  TOTAL");
		System.out.println("----------------------------------");
		for(counter = 0; counter < items.size(); counter++){
		System.out.println(items.get(counter) + "\t" + quantity.get(counter) + "\t" + price.get(counter) + "\t" + totals.get(counter));
	subTotal += totals.get(counter);
      }

double discount = discountGiven * subTotal / 100;
double vat = 17.50 / 100 * subTotal;
double BillTotal = subTotal + discount + vat;
System.out.println("--------------------------------------");	

System.out.println( "\t" + "Sub Total:" + "\t" +  subTotal);	
System.out.println( "\t" + "Discount:" + "\t" +   discount);
System.out.printf(" 	VAT  @17.50:   %2f%n", vat);
		
System.out.println("--------------------------------------");	

System.out.printf("	BillTotal:     %.2f%n", BillTotal); 

System.out.println(" ======================================");
System.out.println("THIS IS NOT A RECEIPT, KINDLY PAY " + BillTotal);
System.out.println("=========================================");
	
System.out.println("How much did the customer give to you? ");
double AmountPaid = input.nextDouble();

	System.out.println("SEMICOLON STORES ");
			System.out.println("MAIN BRANCH ");
			System.out.println("LOCATION :  312, HERBERT MACAULAY WAY, SABO YABO, LAGOS");
			System.out.println("TEL: 03293828343 ");
			System.out.println(date);
			System.out.println("Cashier:  " + cashierName);
			System.out.println("Customer's Name:  " + customerName);

	System.out.println("=================================");
	System.out.println("ITEM \t QTY \t PRICE \t  TOTAL");
	System.out.println("----------------------------------");
	
 discount = discountGiven * subTotal / 100;
 vat = 17.50 / 100 * subTotal;
 BillTotal = subTotal + discount + vat;
  double Balance = BillTotal - AmountPaid;
System.out.println("--------------------------------------");	

System.out.println( "\t" + "Sub Total:" + "\t" +  subTotal);	
System.out.println( "\t" + "Discount:" + "\t" +   discount);
System.out.printf(" 	VAT  @17.50:   %2f%n", vat);
		
System.out.println("--------------------------------------");	

System.out.printf("	BillTotal:    %.2f%n",   BillTotal); 
System.out.printf("      AmountPaid:    %.2f%n ",  AmountPaid);
System.out.printf("	 Balance:     %.2f%n",   Balance);
System.out.println("===========================================");
       System.out.println("THANK YOU FOR YOUR PATRONAGE ");
System.out.println("========================================");

	}

}