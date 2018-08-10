package jianzhi_offer;
import java.util.Stack;
public class Offer21 {
	public static void main(String[] args)
	{	
		int []a1={1,2,3,4,5};
		int []a2={4,5,3,2,1};
		System.out.println(IsPopOrder(a1, a2));
	}	
	public static boolean IsPopOrder(int [] pushA,int [] popA)
	{
		Stack<Integer>stack=new Stack<Integer>();
		int index=0;
		for(int i=0;i<pushA.length;i++)
		{
		 stack.push(pushA[i]);
		 while(!stack.empty()&&stack.peek()==popA[index])
			 {
				 stack.pop();
				 index++;
			 }			 
		 }
		return stack.empty();
	  }

}
