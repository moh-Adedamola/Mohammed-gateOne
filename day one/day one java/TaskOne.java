import java.util.Scanner;

public class TaskOne{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int counter = 0;

	int sum = 0;

	for(counter = 1; counter <= 10; counter++){

	System.out.print("Enter A Score: ");

	int score = scanner.nextInt();

	sum += score;

	}

	

	System.out.println("\nSum Of The Scores Is: " + sum);








	}









}