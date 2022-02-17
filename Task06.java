package group5hw;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int remainder;
		
		boolean isPrime =true;
		System.out.println("Enter a number:");
		
		int numCheck = in.nextInt();
		for(int i=2; i <=numCheck /2; i++) {
			remainder = numCheck %i;
			if (remainder ==0) {
				isPrime =false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(numCheck+ " is prime");
		}else {
			System.out.println(numCheck+" is not prime");
		}
			
	}

}
