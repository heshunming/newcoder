package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;

public class Offer64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={2,3,4,2,6,2,5,1};
		ArrayList<Integer>list=maxInWindows(num, 3);
		for(int e:list)
		{
			System.out.print(" "+e);
		}
	}
	 public static  ArrayList<Integer> maxInWindows(int [] num, int size)
	 {
		ArrayList<Integer> list=new ArrayList<Integer>(),array=new ArrayList<>();
		if(num.length==0||size==0)		
			return list;		
		int len=num.length,sum=0,max=0,maxindex=size-1;
		for(int i=0;i<size-1;i++)
			sum+=num[i];
		max=sum;
		for(int i=size;i<len;i++){
			sum=sum-num[i-size]+num[i];
			if(sum>max)
			{
				maxindex=i;
				max=sum;
			}
		}
		for(int i=maxindex-size+1;i<=maxindex;i++)
			list.add(num[i]);
		 return list;		 
	        
	 }

}
