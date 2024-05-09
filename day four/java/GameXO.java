import java.util.Scanner;
import java.util.Arrays;


public class GameXO{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Welcome To GameXO");

	char[][] numbers = new char[3][3];

	for(int counter = 0; counter < 3; counter++){

		for(int count = 0; count < 3; count++){
		
		System.out.print("Enter X or O: ");

		numbers [counter][count] = scanner.nextInt().charAt(0);

		}
	}

	
	System.out.print(Arrays.toString(numbers));

	

	}









}