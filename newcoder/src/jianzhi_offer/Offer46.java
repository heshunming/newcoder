package jianzhi_offer;

import java.util.ArrayDeque;

public class Offer46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LastRemaining_Solution(6,6));
	}
public static int LastRemaining_Solution(int n, int m) {
		ArrayDeque<Integer> queue=new ArrayDeque<>();
		if(m<1||n<1)
		{
			return -1;
		}
		for(int i=0;i<n;i++)
		{
			queue.addLast(i);
		}
		while(queue.size()>1)
		{
			for(int j=0;j<m-1;j++)
			{
				queue.addLast(queue.removeFirst());
			}
			queue.removeFirst();
		}
		return queue.pop();       
    }

}
