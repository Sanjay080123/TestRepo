package prac.java;

public class BiggestNumberInArray {

	public static void main(String[] args) {
		int[] a = {10, 11 , 19, 100 , 20 ,90 , 99};
		int temp = 0;
		for(int i =0;i<a.length;i++){
				if(temp <a[i]){
					temp = a[i];
				}		
		}
		System.out.println(temp);

	}

}
