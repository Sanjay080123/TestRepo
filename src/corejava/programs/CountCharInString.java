package corejava.programs;

public class CountCharInString {

	public static void main(String[] args) {
		String str = "Sanjay";
		int count = str.length() - str.replace("j", "").length();
		System.out.println(count);
		
	}

}
