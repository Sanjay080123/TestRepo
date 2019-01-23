package corejava.programs;


public class DS {

	public static void main(String[] args) {
		int[] a = {1,0,1,0,0,1,1,0,1};
		int b = 0;
		int c = a.length -1;
		while (b<c){
			if (a[b] == 1){
				a[c] += a[b];
				a[b] = a[c] - a[b];
				a[c] = a[c] - a[b];
				c++;
			}
			else{
				b--;
			}
			System.out.println(a[b]+a[c]);
		
		}
		
	}
}
