package wangyi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Å£¿ÍÍø£ºÄ§·¨±Ò
public class Mofabi {

	public static void main(String[] args) {
		
		 Scanner cin = new Scanner(System.in);   
		 int n=cin.nextInt();
         int mid=(int) Math.log(n)+1;
       
         //ArrayList<Integer> arr=new ArrayList<Integer>();
         int[] aa=new int[mid+2];
		 for(int i=0;i<mid+1;i++)
		{
			aa[i]=0;
		}
       
		 int kk=0;
		for(;n>0&&kk<aa.length;n=(n-1)/2,kk++)
		{
			if(n%2==0)
			{
				aa[kk]=2;
				System.out.print(2);
			}else
			{
				aa[kk]=1;
				System.out.print(1);
			}
			;
		}
		System.out.println();
		for(int i=0;i<aa.length;i++)
		{
			if(aa[aa.length-i-1]!=0)
				System.out.print(aa[aa.length-1-i]);
		}
		
	
	}
	        

}
