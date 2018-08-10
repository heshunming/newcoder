package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Offer23 {

	public static void main(String[] args) {	
		int[]a={1,5,2,3,4,8,9,12,0,18,28,29};
		System.out.print(VerifySquenceOfBST(a));
	}
	public static  boolean VerifySquenceOfBST(int [] sequence) 
	{     
		if(sequence.length==0)return false;
		return judge(sequence,0,sequence.length-1);
    }
	public static  boolean judge(int[] array,int start,int end)
	{			
		if(start>=end)return true;
		int i=start;
		while(i<end&&array[i]<array[end])
			i++;
		for(int k=i;k<end;k++)
			if(array[k]<array[end])
				return false;		
		return judge(array,start,i-1)&&judge(array,i,end-1);
	}

}
