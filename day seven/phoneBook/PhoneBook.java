import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{

	public static void main(String[] args){


		ArrayList<String>firstNames e= new ArrayList<>();

		ArrayList<String>lastNames = new ArrayList<>();

		ArrayList<String>phoneNumbers = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.print("WELCOME TO THE PHONEBOOK APP");
	
		System.out.println();

	String prompt = """
	
	Press 
	1 -> ADD CONTACT
	2 -> REMOVE CONTACT
	3 -> FIND CONTACT BY PHONE NUMBER
	4 -> FIND CONTACT BY FIRST NAME
	5 -> FIND CONTACT BY LAST NAME
	6 -> EDIT CONTACT
	7 -> EXIT
	
	""" ;

	System.out.println(prompt);

	Scanner  input = new Scanner(System.in);

	int userInput = input.nextInt();


	switch(userInput)
			







	






	}















}