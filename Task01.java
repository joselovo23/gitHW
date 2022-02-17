package group5hw;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many integers would you like to store?");
		int num = in.nextInt();
		int[] array = new int[num];
		for (int i =0; i <array.length; i++) {
			array[i]=in.nextInt();
		}
		int sum=0;
		for(int j=0; j<array.length; j++) {
			sum =sum+array[j];
		}
		System.out.println(sum);
	}

}
