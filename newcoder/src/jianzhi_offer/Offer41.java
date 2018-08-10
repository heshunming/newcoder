package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Offer41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindContinuousSequence(100);
		//System.out.println(123);
		
	}
	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>>list=new ArrayList<>();
		
		if(sum==1||sum==0)
		{
			return list;
		}
		int i=sum/2+1,j;
		
		for(;i>0;i--)
		{
			ArrayList<Integer>array=new ArrayList<>();
			int temp=0;
			for(j=i;j>0;j--)
			{
				temp=temp+j;
				array.add(j);
				if(temp==sum)
				{
					//System.out.println("i:"+i+" j:"+j);
					Collections.sort(array);
					list.add(array);
					break;
				}
				if(temp>sum)
				{
					break;
				}
					
				
			}
		}
		Collections.sort(list, new Comparator<ArrayList<Integer>>(){			

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				// TODO Auto-generated method stub
				return o1.get(0).compareTo(o2.get(0));
			}
			
		});
		//System.out.println(list.size());
		for(ArrayList<Integer> li:list)
		{
			for(Integer i1:li)
			{
				//System.out.print(" "+i1);
			}
			//System.out.println();
		}
		
		return list;	       
    }

}
