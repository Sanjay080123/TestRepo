package corejava.programs;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,1,2,4,5,6,6,2};
		for(int i=0;i<=a.length;i++){
			for(int j=i+1;j<=a.length-1;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
				else{
					break;
				}
			}
		}
	}

}
