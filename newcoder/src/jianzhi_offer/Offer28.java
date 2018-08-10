package jianzhi_offer;

import java.util.HashMap;

public class Offer28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,3,3,2,1,1,1,1};
		System.out.print(MoreThanHalfNum_Solution(a));
	}
	 public static  int MoreThanHalfNum_Solution(int [] array) {
		if(array.length==1)
		{
			return 1;
		}
		 HashMap<Integer,Integer>hs=new HashMap<>();
		for(int e:array)
		{
			if(hs.containsKey(e))
			{
				//if(){}
				hs.put(e,hs.get(e)+1);
			}else
			{
				hs.put(e, 1);
			}
			if((hs.get(e))>array.length/2)
					return 2;				
		}
		 
		 return 0;
	 }

}
