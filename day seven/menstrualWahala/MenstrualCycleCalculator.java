import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleCalculator{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("WELCOME TO THE MENSTRUAL CYCLE CALCULATOR");
	
		System.out.println("Assumed Length Of Cycle Is Between 21 - 35 Days");
		
		System.out.print("Enter The Date Of Your Last Menstrual Flow (YYYY-MM-DD): ");	

		String lastFlowDate = scanner.nextLine();

		LocalDate lastFlowDatePeriod = LocalDate.parse(lastFlowDate, DateTimeFormatter.ofPattern("yyyy-MM-dd") );

		System.out.print("Enter The Average Length Of Your Cycle In Days: ");

		int cycleLength = scanner.nextInt();

		LocalDate actualDate = LocalDate.parse(lastFlowDate);
		
		LocalDate nextMenstrualFlow = actualDate.plusDays(cycleLength);

		System.out.print("The Next Menstrual Flow: " + nextMenstrualFlow);

		LocalDate ovulationDate = actualDate.plusDays(cycleLength / 2);

		System.out.print("\nYour Ovulation Date Is Between : " + ovulationDate.minusDays(2) + " - " + ovulationDate.plusDays(2));

		

		




	}








}