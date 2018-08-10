package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;

public class Offer29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		
		 int i,len=input.length;
		 ArrayList<Integer>array1=new ArrayList<Integer>();
		 ArrayList<Integer>array2=new ArrayList<Integer>();
		 if(input==null||k==0||k>len)
		 {
			 return array2;
		 }
		 
		 for(int e:input)
		 {
			 array1.add(e);
		 }
		 Collections.sort(array1);
		 for(i=0;i<k;i++)
		 {
			 array2.add(array1.get(i));
		 }
		 return array2;	        
	 }
}
