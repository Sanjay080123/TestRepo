package datastructure;

public class RecursionConcept {

	public static void main(String[] args) {
		reduceByOne(10);


	}
	
	/*
	 * Reducing numbers one by one
	 */
	public static void reduceByOne(int n){
		if(n!=0){
			reduceByOne(n-1);
		}
		System.out.println("After recursion = "+n);
	}
	
	/*
	 * Tower of Hanoi
	 */
	
	
	
}
