package corejava.programs;

public class BiggestNumberInArray {

	public static void main(String[] args) {
		int[]a = {100,200,999,10,11,1,99,20};
		int big = 0;
		for (int i =0;i<a.length;i++){
			if(big<=a[i]){
				big = a[i];
			}
		}
		System.out.println(big);
	}

}
