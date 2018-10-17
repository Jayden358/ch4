package ch4;
import java.util.Scanner;
//Jayden Williams
import java.util.scanner;

public class AndOr {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			//Receive input
			System.out.println("enter an integer");
			int number = input.nextInt();
			
			
			
			if (number % 2 == 0 && number % 3 == 0) {
				System.out.println(number + " is divisible by 2 and 3.");
			}
			if (number % 2 == 0 || number % 3 == 0) {
				System.out.println(number + " is divisible by 2 and 3.");
			}
			if (number % 2 == 0 ^ number % 3 == 0) {
				System.out.println(number + " is divisible by 2 or 3, not both");
			}

	}

}
