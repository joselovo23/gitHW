package group5hw;

public class Task04 {

	public static void main(String[] args) {
		int [][] array = {
				{3,2,4,5,6},
				{12, 13,14, 15,13},
				{32, 34,43,65,32}
		};
		int even =0;
		int odd=0;
		
		for (int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j] %2==0) {
					even += array[i][j];
				}else
					odd += array[i][j];
			}
		}
		System.out.println("The sum of odd numbers is "+odd+" The sum of even numbers is "+even);
	}

}
