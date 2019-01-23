package programs;

public class reverseString {

	public static void main(String[] args) {
		String str ="Sanjay";
		String s1 = "";
		int count = str.length();
		for (int i=count-1 ;i>=0;i--){
			s1 = s1 + str.charAt(i);
		}
		System.out.println(s1);

	}

}
