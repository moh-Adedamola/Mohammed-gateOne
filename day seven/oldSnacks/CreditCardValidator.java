import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {

        Scanner crimson = new Scanner(System.in);

        System.out.print("Hello, Kindly Enter Card Details To Verify: ");

        String cardDetails = crimson.next();

	System.out.println("Credit Card Type: " + getCardType(cardDetails));

	System.out.println("Credit Card Number: " + cardDetails );

	System.out.println("Credit Card Digit Length: " + creditCardSize(cardDetails));

        int[] digits = doubleDigits(cardDetails);

        int numb1 = doubleDigits1(digits);

        int numb2 = doubleValue1(digits);

        String numbers = addNumber(numb1, numb2);

        System.out.println(numbers);


        
    }

    public static int creditCardSize(String number) {
        return number.length();
    }

    public static int[] doubleDigits(String number) {
        int[] digits = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return digits;
    }

    public static int doubleDigits1(int[] digits) {
        int countNum = 0;

        for (int i = digits.length - 2; i >= 0; i -= 2) {
            countNum++;
        }

        int[] storeDigits = new int[countNum];

        int num = 0;

        for (int i = digits.length - 2; i >= 0; i -= 2) {
            int multiply = digits[i] * 2;

            if (multiply > 9) {
                storeDigits[num] = (multiply / 10) + (multiply % 10);
            } else {
                storeDigits[num] = multiply;
            }
            num++;
        }

        int num1 = 0;

        for (int storeDigit : storeDigits) {
            num1 += storeDigit;
        }

        return num1;
    }

    public static int doubleValue1(int[] digits) {
        int countNum1 = 0;

        for (int i = digits.length - 1; i >= 1; i -= 2) {
            countNum1++;
        }

        int[] storeDigits1 = new int[countNum1];

        int num1 = 0;

        for (int i = digits.length - 1; i >= 0; i -= 2) {
            storeDigits1[num1] = digits[i];
            num1++;
        }

        int num2 = 0;

        for (int storeDigit : storeDigits1) {
            num2 += storeDigit;
        }

        return num2;
    }

    public static String addNumber(int num1, int num2) {
        int sum = num1 + num2;

        if (sum % 10 == 0) {
            return "Credit Card Validity Status: Valid";
        }
        return "Credit Card Validity Status: Invalid";
    }

    public static String getCardType(String number) {
        char firstDigit = number.charAt(0);

        if (firstDigit == '4') {
            return "Visa Card";
        }

        if (firstDigit == '5') {
            return "Master Card";
        }

        if (number.startsWith("37")) {
            return "American Express Card";
        }

        if (firstDigit == '6') {
            return "Discover Card";
        }

        return "Invalid Card Type";
}
}