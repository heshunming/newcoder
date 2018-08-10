package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;

public class Offer45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num={1,0,0,0,1};
		System.out.println(isContinuous(num));
	}
	 public static boolean isContinuous(int [] numbers) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();		
		for(int e:numbers)		
			list.add(e);
			Collections.sort(list);
			int num=list.lastIndexOf(0),gap=0;
			for(int i=num+1;i<list.size();i++)
			{
				if(i!=num+1)
					if(list.get(i)==list.get(i-1))
						return false;
					else
							gap+=list.get(i)-list.get(i-1);
			}	
			gap-=(list.size()-num-2);
			System.out.println((num+1)+":"+gap);			
			if((num+1)>=gap)return true;
		return false;
	 }
//	 public boolean isContinuous1(int [] numbers) {
//		    
//			ArrayList<Integer>list=new ArrayList<Integer>();
//			int zero_num=0,gap=0;
//			for(int e:numbers)
//			{
//				if(e==0)
//				{
//					zero_num++;//确定大小王的个数
//				}else
//				{
//					if(list.contains(e))
//						return false;//如果含有两个相同的非0牌，则肯定凑不齐顺子
//				}
//				list.add(e);
//			}		
//			 Collections.sort(list);
//			 int index;
//			 for(int i=0;i<list.size()-1;i++)
//			 {
//				 if(list.get(i)==0)
//				 {
//					 continue;
//				 }
//				 gap+=list.get(i+1)-list.get(i);	
//				 if(gap>=list.size())
//				 {
//					 return false;
//				 }
//			 }
//			 if(gap>=list.size())
//			 {
//				 return false;
//			 }
//			 return true;
//	    }
}
