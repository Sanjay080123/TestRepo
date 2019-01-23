package corejava.programs;

import java.awt.List;
import java.util.ArrayList;

public class CoreJavaPractice {

	//Return Prac
		public static String Method1(){
			String str = "Sanjay";
			return str;
			
		}
		public static int interger(){
			System.out.println("the value");
			return 10;
		}
		
		public static void sum(int a , int b){
			int sum = a+b;
			System.out.println(sum);
		}
		
	//Method Overloading -- Method having same name with diff argument signature and no of arguments
		public static void sum(double c , double  d){
			double sum1 =  c + d;
			System.out.println(sum1);
		}
		
		
		
	public static void main(String[] args) {
		System.out.println(CoreJavaPractice.Method1());
		System.out.println(CoreJavaPractice.interger());
		CoreJavaPractice.sum(12.8, 12.9);
		CoreJavaPractice.sum(12, 11);
		A.Test();
		System.out.println(A.i= 100);
		B b = new B();
		b.Test1();
		System.out.println(b.j = 10);
		C c1 = new C();
		C c = new C(10 , "sanjay");
		System.out.println(c.i);
		System.out.println(c.name);
		D d = new D();
		D d1 = new D(99);
		System.out.println(d1.a);
		D d2 = new D(12.9);
		System.out.println(d2.b);
		E e = new E();
		e.newmet();
		F f = new F();
		f.test();
		f.dog();
		subclass sc = new subclass();
		sc.display1();
		dog dg = new dog();
		dg.move();
		dg.sound();
		snake sk = new snake();
		sk.move();
		sk.sound();
		G g = new G();
		g.test();
		g.test1();
		H.ne();
		J.display();
		//Collections Concept
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("2");
		ls.add("10");
		ls.add("11");
		System.out.println(ls);
		//Converting Arraylist to array
		Object[] numbers = ls.toArray(new String[ls.size()]);    // toArray is used to confirm ArrayList to Array
		for(Object s:numbers){
			System.out.println(s);
		}
		
		
		
	}

}

//Static methods
class A{
	static int i;
	public static void Test(){	
		System.out.println("Today i am happy");
	}
}

//Non Static Methods
class B{
	int j;
	public void Test1(){
		System.out.println("Today");
	}
}

//Constructor
class C{
	int i;
	String name;
	C(){
		System.out.println("Default constructor created");
	}
	C(int a , String str){
		System.out.println("Parameterized constructor");
		i = a;
		name = str;
		
	}
}

//Use of Call to this -- this()
class D{
	int a ;
	double b;
	D(){
		System.out.println("call to this start");
	}
	D(int value){
		//this();
		System.out.println("call to this applied");
		a = value;
	}
	D(double add){
		this();
		b = add;
	}
}

//Use of this keywoard
class E{
	int i = 10;
	public void newmet(){
		System.out.println(this.i);
	}
	E(){
		System.out.println(this.i);
		this.newmet();
	}
}

//Inheritance Concepts
class move{
	int a;
	public void dog(){
		System.out.println("boo boo");
	}
}
class F extends move{
	public void test(){
		System.out.println(this.a=100);
		System.out.println("test starts");
	}
}

//Use of super keyword --- 1) Super is used by class constructors to invoke constructors of its parent class.
//2) super keyword can call super class method in sub class inside subclass method

class superclass{
	int number;
	public void display(){
		System.out.println("Super class");
	}
	superclass(int a){
		number = a;
		System.out.println(number);
		System.out.println("Constructor by super call");
		
	}
}

class subclass extends superclass{
	subclass(){
		super(10);
		}
	public void display1(){
		this.display();
		System.out.println("Sub class ends");
	}
}

//Overriding Concepts and abstract
abstract class Animal{
	abstract void move();
	abstract void sound();
}

class dog extends Animal{
	public void move() {
		System.out.println("Dog run");
	}
	public void sound(){
		System.out.println("dog sound - boo");
	}
}

class snake extends Animal{
	public void move() {
		System.out.println("snake run");
	}
	public void sound(){
		System.out.println("snake sound - hiss");
	}
}

//Interface
interface I{
	 int i = 10;
	void test();
	void test1();
}

class G implements I{
	public void test(){
		System.out.println(i);
		System.out.println("interface 1");
	}
	public void test1(){
		System.out.println("Interface 2");
	}
}

//String concepts
class H{
	public static void ne(){
	String str = "sanjay";
	String st = new String("sanjay");
	if(str.equals(st) && str==st){
		System.out.println("pass");
	}else{
		System.out.println("fail");
	}
	}
}

// String methods
class J{
	public static void display(){
		String str = "sanjay kumar B.tech";
		System.out.println(str.trim());
		String[] arr = str.split(" ");
		for(String i: arr){
			System.out.println(i);
		}
		System.out.println(str.substring(3));
		System.out.println(str.substring(0, 4));
	}
}


