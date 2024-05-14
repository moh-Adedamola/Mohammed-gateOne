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

		System.out.print("Your Next Menstrual Flow Starts On: " + nextMenstrualFlow);

		LocalDate ovulationDate = nextMenstrualFlow.minusDays(14);

		System.out.print("\nYour Ovulation Date Is: " + ovulationDate+"\n");

		LocalDate fertilePeriodStart = ovulationDate.minusDays(7);

        	LocalDate fertilePeriodEnd = ovulationDate.plusDays(2);

		System.out.print("Your Fertile Period Is Between : " + ovulationDate.minusDays(7) + " - " + ovulationDate.plusDays(2) +"\n");

		System.out.println("YOUR SAFE PERIOD ARE ANY DAYS THAT DO NOT FALL UNDER THE FERTILE WINDOW!!");


	}

}