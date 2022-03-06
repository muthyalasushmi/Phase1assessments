package assistedprojectsPhase1;

public class StackOperations30 {
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX];  
	boolean isEmpty() 
	{ 
    		return (top < 0); 
	} 
	StackOperations30() 
	{ 
    		top = -1; 
	} 
	boolean push(int x) 
	{ 
    		if (top >= (MAX-1)) 
    		{ 
        	 System.out.println("Stack Overflow"); 
        	 return false; 
    		} 
    		else
    		{ 
        	 a[++top] = x; 
        	 System.out.println(x + " pushed into stack"); 
        	 return true; 
    		} 
	} 
int pop() 
	{ 
    		if (top < 0) 
    		{ 
        	 System.out.println("Stack Underflow"); 
        	 return 0; 
    		} 
    		else
    		{ 
        	 int x = a[top--]; 
        	 return x; 
    		} 
	} 

	public static void main(String args[])
{
    		StackOperations30 s = new StackOperations30(); 
    		s.push(101); 
    		s.push(207); 
    		s.push(700); 
    		System.out.println(s.pop() + " Popped from stack"); 
	}
}
	
