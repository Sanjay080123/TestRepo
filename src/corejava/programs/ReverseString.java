package corejava.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Sanjay";
		String st = "";
		for (int i = str.length()-1;i>=0;i--){
			st = st + str.charAt(i);
		}
		System.out.println(st);

	}

}
