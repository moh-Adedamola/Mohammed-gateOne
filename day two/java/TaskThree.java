import java.util.Scanner;

public class TaskThree{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int[] numbers = new int[10];

	for(int counter = 0; counter < 10 ; counter++){

	System.out.print("Enter A Score: ");

	numbers[counter] = input.nextInt();


	}

	for(int count = 0; count < 10; count++){

	System.out.println( numbers[count] );

	}


	}







}