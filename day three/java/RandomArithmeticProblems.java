import java.util.Scanner;
import java.util.Random;

public class RandomArithmeticProblems{

	public static void main(String[]  args){

	Random random = new Random();

        int questionSelection = random.nextInt;

        String answerProvided = random.nextLine();

	int counter = 1;

	for(counter = 1; counter <= 10; counter++){

	System.out.println("Randomly picked question: " + questionSelection);


	if(answerProvided == "correct"){
		System.out.print("Correct Answer");

	}

	else{

		System.out.print("Incorrect");

	}

	}

	





	}



}