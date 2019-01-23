package corejava.programs;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		At a = new At();
		

	}

}


class At{
	public void test1(int a, double b){
		System.out.println("sam");
	}
	
	public void test(int b, double a){
		System.out.println("sanjay");
	}
}