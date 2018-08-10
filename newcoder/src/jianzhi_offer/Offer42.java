package jianzhi_offer;

import java.util.ArrayList;

public class Offer42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,18};
		System.out.println(FindNumbersWithSum(array, 20));

	}
	 public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		
		 ArrayList<Integer>list=new ArrayList<Integer>();
		 int min=Integer.MAX_VALUE,multemp=0,sumtemp=0;
		int end=array.length;
		int i=0,j;
		 
		for(;i<end;i++)
		{
			for(j=i+1;j<end;j++)
			{
				multemp=array[i]*array[j];
				if(array[i]+array[j]==sum)
				{
					if(multemp<min)
					{
						min=multemp;
						list.clear();
						list.add(array[i]);
						list.add(array[j]);
						end=j;
					}
				}
			}
		}
		 return list;	        
	 }

}
