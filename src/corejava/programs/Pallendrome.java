package corejava.programs;

import java.util.Scanner;

public class Pallendrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter string");
		String str = scn.next();
		String st = "";
		for (int i=str.length()-1 ;i>=0;i--){
			st = st+str.charAt(i);
			
		}
		if( str.equalsIgnoreCase(st))
		{
			System.out.println("pallendrome");
		}
		else {
			System.out.println("not pallendrome");
		}
	}
}
