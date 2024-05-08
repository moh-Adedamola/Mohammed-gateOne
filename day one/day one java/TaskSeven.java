import java.util.Scanner;

public class TaskSeven{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int counter = 0;

	int sum = 0;

	int average = 0;

	for(counter = 1; counter <= 10; counter++){

	System.out.print("Enter A Score: ");

	int score = scanner.nextInt();
	
	if(score % 2 == 0){

		sum+= score;

		average = sum / 5; 

	}

	}

	System.out.println("\nThe Sum Of The Even Numbers In The Colleceted Score Is: " + sum);	

	System.out.println("\nThe Average Of The Even Numbers In The Colleceted Score Is: " + average);








	}









}