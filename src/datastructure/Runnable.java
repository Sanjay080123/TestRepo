package datastructure;



public class Runnable {

	
	public static void main(String[] args) {
		
		StackImplementationOnFixedSizeArray num = new StackImplementationOnFixedSizeArray();
		num.push(15);
		num.show();
		num.push(11);
		num.show();
		num.push(10);
		num.show();
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
		
		
		
//		StackImplementationOnDynamicSizeArray num1 = new StackImplementationOnDynamicSizeArray();
//		num1.push(1);
//		num1.show();
//		num1.push(2);
//		num1.show();
//		num1.push(3);
//		num1.show();
//		num1.push(4);
//		num1.show();
//		num1.push(5);
//		num1.show();
		
		   
	}

}
