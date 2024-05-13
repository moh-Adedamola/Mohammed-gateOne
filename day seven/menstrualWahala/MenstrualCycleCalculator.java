import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleCalculator{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		//LocalDate currentDate = LocalDate.now();
	
		System.out.println("WELCOME TO THE MENSTRUAL CYCLE CALCULATOR");
	
		System.out.println("Assumed Length Of Cycle Is Between 21 - 35 Days");
		
		System.out.print("Enter The Date Of Your Last Menstrual Flow: ");	

		String lastFlowDate = scanner.nextLine();

		LocalDate lastFlowDate = LocalDate.parse(lastFlowDate, DateTimeFormatter );

		System.out.print("Enter The Average Length Of Your Cycle In Days: ");

		int cycleLength = scanner.nextInt();

		LocalDate nextMenstrualFlow = lastFlowDate.plusDays(cycleLength);

		//System.out.print("Enter The Duration Of Menstrual Flow In Days: ");

		//String flowDuration = scanner.nextLine();


		
	




	





	}








}