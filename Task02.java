package group5hw;

public class Task02 {

	public static void main(String[] args) {
		int [] [] array = {
				{2, 3, 4, 5 ,6},
				{43, 47 ,21, 98}
		};
		int sum =0;
		
		for( int i =0; i < array.length; i++) {
			for( int j=0; j< array[i].length; j++) {
				sum = sum + array[i][j];
			}
		}
		System.out.println(sum);
	}

}
