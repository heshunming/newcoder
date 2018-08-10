package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;

public class Offer20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	ArrayList<Integer>arr=new ArrayList<>();
	 
    public void push(int node) {
       // stack.add(node);
    	arr.add(0,node);
    }
    
    public void pop() {
      arr.get(0);
      arr.remove(0);
    	//  stack.
    }
    
    public int top() {
		
    	return arr.get(0).intValue();
    	//return 0;
	       
    }
    
    public int min() {
    	int min=top();
    	for(int e:arr)
    	{
    		if(e<min)
    		{
    			min=e;
    		}
    	}
    	return min;        
    }

}
