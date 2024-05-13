import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleCalculator{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		LocalDate currentDate = LocalDate.now();
	
		System.out.println("WELCOME TO THE MENSTRUAL CYCLE CALCULATOR");
	
		System.out.println("Assumed Length Of Cycle Is Between 21 - 35 Days");

		System.out.print("Enter The Average Length Of Your Cycle: ");

		String cycleLength = scanner.nextLine();

		System.out.print("Enter The Duration Of Menstrual Flow In Days: ");

		String flowDuration = scanner.nextLine();

		System.out.print("Enter The First Day Of Current Menstrual Cycle: ");

		String startDate = scanner.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate startDate = LocalDate.parse(startDate, formatter);

		String nextPeriodDate = startDate + cycleLength;

		System.out.print("The Start Of The Next Period Is In " + nextPeriodDate + "Days" );

	




	





	}








}