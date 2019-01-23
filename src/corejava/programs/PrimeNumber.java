package corejava.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scn.nextInt();
		boolean flag = true;
		for (int i = 2;i<a-1;i++)
		{
			if (a%i==0){
				flag = false;
				System.out.println("Number is not prime");
				break;
			}
		}
		if(flag){
			System.out.println("number is prime");
		}

	}

}
