package ch4;
import java.util.Scanner;
import java.util.Random;
public class SubtractionGame {

	public static void main(String[] args) {
		int x=1;
		
		while(x==1) {
		Scanner input = new Scanner(System.in);
		//variables
		Random rand = new Random();
		int num1 = rand.nextInt(11) + 0;
		int num2 = rand.nextInt(11) + 0;
		int answer;
		int total;
		if (num1>num2) {
			System.out.println("what is "+ num1+ "-" +num2+ "?");
			answer = input.nextInt();
			total = num1-num2;
			
		}else {
			System.out.println("what is "+ num2+ "-" +num1+ "?");
			answer = input.nextInt();
			total = num2-num1;
		}
		
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
