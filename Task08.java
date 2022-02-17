package group5hw;

public class Task08 {

	public static void main(String[] args) {
		int [] array = {2,45,65,211,54,32,57,23,5,1};
		
		int max = array[0];
		int min = array[0];
		
		for(int i=1; i< array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}else if (array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("The max number is "+max);
		System.out.println("The min number is "+min);
		
		
		
		

	}

}
