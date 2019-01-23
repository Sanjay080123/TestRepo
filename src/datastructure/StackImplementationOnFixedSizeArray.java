package datastructure;


public class StackImplementationOnFixedSizeArray {

	int stack[] = new int[5];
	int top = 0;
	
	public void push(int data){
		if(top==5){
			System.out.println("Stack is full");
		}else{
			stack[top] = data;
			top = top+1;
		}
		
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
