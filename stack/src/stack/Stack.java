package stack;
import java.util.Scanner ;  

public class Stack {
	
	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size ){
		arr = new int[size];
		capacity = size;
		top =-1;
	}
	
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("stack overflow");
			System.exit(1);
		}
		
		
		System.out.println("Inserting   " +x);
		arr[++top] = x;
		
	}
	
public  int pop()
{
if(isEmpty()) {
	System.out.println("stack empty");
	
 }
return arr[top--];
}
	
	public int getsize() {
	return top+1;
	}
	
	public Boolean  isEmpty() {
		return top == -1;
	}
	
	public Boolean isFull()
	{
		return top == capacity - 1;
	}
	
	public void printstack() {
		 for(int i =0; i<=top; i++) {
			 System.out.println(arr[i] + ".");
		 }
		
	}

	

public static void main(String [] args)
{
	 Scanner Scanner_name= new Scanner(System.in); 
	 int n = Scanner_name.nextInt();
	while(true) {
		
		
		Stack stack = new Stack(n);
		
		System.out.println("1) PUSH \t 2) POP \t 3)SIZE \t 4) PRINT STACK\n  ");
		
int option = Scanner_name.nextInt();

		switch (option) {
		
		case 1:
			
			System.out.println("enter the element to be pushed \n");
			
			int value = Scanner_name.nextInt();
			
	    	stack.push(value);
	    	
			break;
			
		case 2:
			
			System.out.printf("element popped out of stack is",stack.pop());
			
			
		case 3:
			 System.out.println(stack.getsize());
			 
		case 4:
			 System.out.println("The elements are\n");
			 
			
		default:
			
			break;
		}
			 
	}

	 
	
}



}
