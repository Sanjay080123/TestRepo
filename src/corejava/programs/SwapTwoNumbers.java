package corejava.programs;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scn.nextInt();
		System.out.println("Enter 2nd number");
		int b = scn.nextInt();
		System.out.println("Numbers before swap a= " +a);
		System.out.println("Numbers before swap b= " +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("number after swap a= " +a);
		System.out.println("number after swap b= " +b);

	}

}
