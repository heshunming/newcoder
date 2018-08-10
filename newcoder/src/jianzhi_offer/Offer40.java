package jianzhi_offer;

import java.util.HashMap;
import java.util.Map;

public class Offer40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	  
		 HashMap<Integer,Integer>hm=new HashMap<>();
			for(int i:array)
			{
				if(hm.containsKey(i))
				{
					hm.put(i, hm.get(i)+1);
				}else
				{
					hm.put(i,1);
					
				}
			}
			int index=0;
			for(Map.Entry<Integer, Integer> entry:hm.entrySet())
			{
				if(entry.getValue()==1)
				{
					if(index==0)
					{
						num1[0]=entry.getKey();
						index++;
					}else if(index==1)
					{
						num2[0]=entry.getKey();
					}
					
				}
			}
	 }

}
