package programs;

public class ReverseStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "My Name is Sanjay";
		String s2 = " ";
		String[] arr = s1.split(" ");
		for (int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
			s2 = s2+arr[i]+ " ";
			
		}
		System.out.println(s2);
	}

}
