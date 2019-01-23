package prac.java;

import java.util.HashSet;
import java.util.Set;

public class FindingRepetiveNumberINArray {

	public static void main(String[] args) {
		
		int[] a = {2,1,2,1,3,1,4,5,5,8};		
		Set<Integer> st = new HashSet<Integer>();
		for(Integer it:a){
			if(st.add(it)==false){
				System.out.println("Found the duplicaten " + it);
			}
		}
	}

}
