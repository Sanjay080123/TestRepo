package datastructure;

public class StackImplementationOnDynamicSizeArray {
	
	int capacity = 2;
	int stack[] = new int[capacity];
	int top;
	
	public void push(int data){
		if(size()==capacity){
			expand(); // Expand the array size twice.
		}
		stack[top] = data;
		top = top+1;	
	}
	
	private void expand() {
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length); // arraycopy is the static method present in System class
		stack = newStack;
		capacity = capacity*2; 
		
	}

	public int pop(){
		int data=0; 
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			top = top-1;
			data = stack[top];
			stack[top]= 0;
		}
		return data;
		
	}
	
	public int peek(){
		int data;
		data = stack[top-1];
		return data;
		
	}
	
	public void show(){
		for(int n: stack){
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public int size(){
		return top;
	}
	
	public boolean isEmpty(){
		return top<=0;
	}

}
