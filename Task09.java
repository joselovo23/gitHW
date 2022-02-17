package group5hw;

public class Task09 {

	public static void main(String[] args) {
		int [] array = {12,3,454,765,23,453,123,7,4,2,1,50};
		
		int bigNum =0;
		int secBig=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]>bigNum) {
				secBig=bigNum;
				bigNum=array[i];
			}else if(array[i]>secBig && array[i]<secBig) {
				secBig=array[i];
			}
		}
		System.out.println("The second biggest number is "+secBig);
	}

}
