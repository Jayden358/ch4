package ch4;
import java.util.Scanner;
//Jayden Williams 10/18
public class AdditionGame {

	public static void main(String[] args) {
			
		int x=1;
	
		while(x==1) {
		Scanner input = new Scanner(System.in);
		//variables
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() /7 % 10);
		int answer;
		int total;
		//show user
		System.out.println("what is "+ num1+ "+" +num2+ "?");
		//await user input
		answer = input.nextInt();
		total = num1+num2;
		//check user input is correct or incorrect
		if (answer == total) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
			System.out.println("The correct answer is "+ total);
		}
		
		

	}

  }
}
