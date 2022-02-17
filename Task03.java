package group5hw;

public class Task03 {

	public static void main(String[] args) {
		int [] [] array = {
				
				{12, 32, 48, 98, 10},
				{2, 5, 8, 5, 3, 9}
		};
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if (array[i][j]%2==0) {
					System.out.println(array[i][j]+" ");
				}
			}
		}
	}

}
