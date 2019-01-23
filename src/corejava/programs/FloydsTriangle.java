package corejava.programs;

import java.util.Scanner;

public class FloydsTriangle {
	
	public static void main(String[] args) {
		int n, num = 1, c, d;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows of floyd's triangle you want");
	      n = in.nextInt();
	 
	      System.out.println("Floyd's triangle :-");
	 
	      for ( c = 1 ; c <= n ; c++ )
	      {
	         for ( d = 1 ; d <= c ; d++ )
	         {
	            System.out.print(num+" ");
	            num++;
	         }
	 
	         System.out.println();
	      }
	   
		
		
		Bm b = new Bm();
		b.m();
		b.m(11);
	}

}


class Am{
	static int number;
	public static void m(){
		System.out.println("sanjay starts");
	}
	public static void m(int a){
		number = a;
		System.out.println(a);
	}
}

class Bm extends Am{
	public static void m(){
		System.out.println("sanjay ends");
	}
}
