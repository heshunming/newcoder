package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;

public class Offer63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 ArrayList<Integer>array=new ArrayList<Integer>();
	 public void Insert(Integer num) 
	 {
		    array.add(num);
		    Collections.sort(array);
	 }

	 public Double GetMedian() 
	 {
		 
			int len=array.size();
			if(len==0)
			{
				return (double) 0;
			}
			if(len%2==0)
			{
				return (double)((double)array.get(len/2)+(double)array.get((len/2)-1))/2;
			}else
			{
				return (double)array.get(len/2);
			}
	    	//return null;	        
	 }

}
