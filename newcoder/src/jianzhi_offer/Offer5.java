package jianzhi_offer;

import java.util.Stack;

public class Offer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        int e;
	    	while(!stack1.isEmpty())
	    	{
	    		stack2.push(stack1.pop());
	    	}
	    	stack1.push(node);
	    	while(!stack2.isEmpty())
	    	{
	    		stack1.push(stack2.pop());
	    	}
	    }
	    
	    public int pop() {
			
	    	return stack1.pop();
	    
	    }
	

}
