package jianzhi_offer;

import java.util.HashMap;

public class Offer37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,3,3,3,4,5};
		System.out.println(GetNumberOfK(array, 3));
	}
	public static int GetNumberOfK(int [] array , int k) {
		
		int start=0,end=array.length,mid,index=-1,count=0;
		while(start<end)
		{
			mid=(start+end)/2;
			if(k>array[mid])
				start=mid+1;
			else if(array[mid]>k)
				end=mid-1;
			else{
					index=mid;
					break;
				}
		}
		System.out.println(index+"count:"+count);
		if(index>=0)
		{
			start=index-1;
			end=index+1;
			count=1;
			while(start>=0&&array[start]==k){
				start--;
				count++;
			}
			System.out.println("pre:"+count);
			while(end<array.length&&array[end]==k){
					end++;
					count++;
				}
		}
		
		return count;
		       
    }
//	public int GetNumberOfK(int [] array , int k) {
//	       if(array==null||array.length==0)
//			{
//				return 0;
//			}
//			
//			HashMap<Integer,Integer>hm=new HashMap<>();
//			for(int i:array)
//			{
//				if(hm.containsKey(i))
//				{
//					hm.put(i, hm.get(i)+1);
//				}else
//				{
//					hm.put(i,1);
//					
//				}
//			}
//			if(hm.containsKey(k))
//			{
//				return hm.get(k);	
//			}
//			else 
//			{
//				return 0;
//			} 
//	    }

}
