package group5hw;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 =in.nextInt();
		System.out.println("Enter another number");
		int num2 =in.nextInt();
		
		int[] first = {num1,num2};
		int[] second = {first[1], first [0]};
		
		for(int num:first) {
			System.out.println(num+" ");
		}
		System.out.println();
		for (int numm: second) {
			System.out.println(numm+" ");
		}
		
		

	}

}
