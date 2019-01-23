package prac.java;

public class Factorial {

	public static void main(String[] args) {
		int factorila = fact(5);
		System.out.println(factorila);
		System.out.println(number(5));
		toh(3, 'a', 'b', 'c');
		
	}
	
	public static int fact(int n){
		int num;
		if(n==1){
			return 1;
		}
		else{
			num = n*fact(n-1); 
		}
		return num;
	}
	
	//*****Printing 1-n number backward****//
	public static int number(int data){
		int d =0;
		if(data ==1){
			return 1;
		}
		else{	
			 d = number(data-1);
			 System.out.println(d);
		}
		return d;
	}
	
	
	//###################*****TOWER OF HANOI******#####################//*********************////
	public static void toh(int n , char beg , char aux , char dest){
		if(n==1){
			System.out.println("Moved disk 1 from " + beg + " to " +dest);
		}
		else{
			toh(n-1, beg, dest	, aux );
			System.out.println("Move disk " + n + " from rod " +  beg + " to rod " + dest);
			toh(n-1, aux , beg ,dest);
		}
		
	}
	
	
}
