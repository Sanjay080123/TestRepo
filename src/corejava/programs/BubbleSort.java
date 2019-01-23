package corejava.programs;


import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[]a = {10,12,4,5,7,100};
		int temp;
		for (int i=0;i<a.length-1;i++)
		{
			for (int j = i;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j]= temp;
				}
				
			}
			System.out.println(Arrays.toString(a));
		}
		

	}

}
