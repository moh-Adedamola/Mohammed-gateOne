import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	

	LocalDate currentDate = LocalDate.now();
	
	System.out.print("Enter Date Of Birth: ");
	
	String dateOfBirth = scanner.nextLine();

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);

	System.out.println(calculateAge(birthDate));	
	
	}

	public static int calculateAge(LocalDate birthDate){

	LocalDate currentDate = LocalDate.now();

	Period period = Period.between(birthDate, currentDate);

	return period.getYears();

	}


}