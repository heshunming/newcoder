package jianzhi_offer;

import java.util.ArrayList;

public class Offer10 {

	//ArrayList<Integer>list=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RectCover(10));
		
	}
	 public static int RectCover(int target) {
	              
	       
		 	int[]f=new int[target+1];
	        return RectCover(target,f);
	        
	    }
	 public static int RectCover(int target,int[]f) {
	        if(target==0)
	            return 0;
	        if(target==1)
	            return 1;
	        if(target==2)
	            return 2;	
	        if(f[target]!=0)return f[target];
	        int num=RectCover(target-1,f)+RectCover(target-2,f);
	        f[target]=num;
	       
	        return num;
	        
	    }
}
