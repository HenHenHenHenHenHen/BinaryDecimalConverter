import java.util.Scanner;

public class UI {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println ("Binary <-> Decimal Converter \n-------\nWould you like to convert from Binary to Decimal (1), or Decimal to Binary(2)?");
		int decision = keyboard.nextInt();
		while (decision != 1 && decision != 2) {
			System.out.println ("Invalid. Please re-enter\nWould you like to convert from Binary to Decimal (1), or Decimal to Binary(2)?");
			decision = keyboard.nextInt();
		}
		String converted = "";
		if (decision == 1) {
			System.out.println ("Please enter the Binary number you would like to convert into Decimal:");
			String binary = keyboard.next();
			converted = BinaryToDecimalConverter.BtoD(binary);
		} else if (decision == 2) {
			System.out.println ("Please enter the Decimal number you would like to convert into Binary:");
			String decimal = keyboard.next();
			converted = BinaryToDecimalConverter.DtoB (decimal);
		}
		System.out.println ("Your Converted Number is: " + converted);
		System.out.println ("Thank you for using this program.");
		keyboard.close();
	}
}
