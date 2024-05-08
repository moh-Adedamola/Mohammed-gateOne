import java.util.Scanner;

public class TaskTwo{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	

	int counter = 0;

	int sum = 0;

	int average = 0;

	for(counter = 1; counter <= 10; counter++){

	System.out.print("Enter A Score: ");

	int score = scanner.nextInt();

	sum += score;

	average = sum / 10 ;

	}

	

	System.out.println("\nAverage Of The Scores Is: " + average);








	}









}