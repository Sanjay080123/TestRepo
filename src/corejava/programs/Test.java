package corejava.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Test {

	public static void main(String[] args) throws Exception {
		Bre b = new Bre();
		b.b();
		b.a();
		yu y = new yu();
		y.one();
		y.two();
		collections c = new collections();
		c.start();
		c.vectorLi();
		c.LinkedLI();
		c.Prio();
		excep ex = new excep();
		ex.exc();
	}

}

class Are {
	public void a(){
		System.out.println("Test");
	}
}

class Bre extends Are {
	
	public void b(){
		System.out.println("Test1");
	}
}

abstract class tr{
	abstract void one();
	public void two(){
		System.out.println("i am sanjay");
	}
}

class yu extends tr{
	public void one(){
		System.out.println("new one");
	}
}

class collections{
	public void start(){
		ArrayList<String> arr = new ArrayList<String>(3);
		arr.add("8");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("4");
		arr.add("4");
		System.out.println(arr);
		for (String i :arr){
			System.out.println(i);
			
		}
	}
	public void vectorLi(){
		Vector<String> v = new Vector<String>();
		v.add("3");
		v.add("1");
		v.add("4");
		v.add("2");
		System.out.println(v);
	}
	
	public void LinkedLI(){
		LinkedList<String> li = new LinkedList<String>();
		li.add("3");
		li.add("1");
		li.add("4");
		li.add("2");
		System.out.println(li);
	}
	public void Prio(){
		PriorityQueue<String> pr = new PriorityQueue<String>();
		pr.add("f");
		pr.add("e");
		pr.add("d");
		pr.add("c");
		pr.add("b");
		pr.add("a");
		System.out.println(pr);
	}
	
	
}

class excep{
	public void exc() throws Exception{
		throw new Exception("New Exception of my own");
	}
}




