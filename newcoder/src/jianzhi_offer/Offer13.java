package jianzhi_offer;

import java.util.ArrayList;

public class Offer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7};
		reOrderArray(arr);
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
	}
	 public static void reOrderArray(int [] array) {
	        
		 ArrayList<Integer> odd=new ArrayList<>();
		 ArrayList<Integer> even=new ArrayList<>();
		 for(int e:array)
		 {
			 if(e%2==0)
			 {
				 even.add(e);
			 }else
				 odd.add(e);			 
		 }
		 for(int od=0;od<odd.size();od++)
		 {
			 array[od]=odd.get(od);
			 System.out.print(odd.get(od)+" ");
		 }
		 for(int ev=odd.size();ev<odd.size()+even.size();ev++)
		 {
			 array[ev]=even.get(ev-odd.size());
			 System.out.print(even.get(ev-odd.size())+" ");
		 }
	 
	 
	 }
}
