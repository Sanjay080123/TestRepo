package datastructure;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int factorial = fact(5);
		System.out.println(factorial);
		int fibonacci = fib(10);
		System.out.println(fibonacci);
		int g = gcd(105, 25);
		System.out.println(g);

	}
	
	/*
	 * Factorial using recursion
	 */
	public static int fact(int a){
		if(a==1){
			return a;
		}else{
			int fact = a * fact(a-1);
			return fact;
		}
	}
	
	
	
	/*
	 * Fibonacci series using recursion
	 */
	public static int fib(int a){
		if(a==1 || a==2){
			return 1;
		}else{
			return(fib(a-1)+fib(a-2));
		}
		
	}
	
	/*
	 * Greatest Common Divisor
	 */
	
	public static int gcd(int a, int b){
		if(a==b){
			return a; 
		}if(a%b==0){
			return b;
		}if(b%a==0){
			return a;
		}
		if(a>b){
			return(gcd(a%b,b));
		}else 
			return(gcd(a,b%a));

	}

}
