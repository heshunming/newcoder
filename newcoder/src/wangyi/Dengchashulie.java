package wangyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Dengchashulie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin=new Scanner(System.in);
		String str=null;
		
		String i=cin.nextLine();
		str=cin.nextLine();
		//System.out.println(str);
		String[] s=str.split(" ");
		ArrayList<Integer> alist=new ArrayList<Integer>();
		for(String st:s)
		{
			alist.add(Integer.valueOf(st));
			//System.out.print(st+" ");;
		}
		Collections.sort(alist);
		Iterator it=alist.iterator();
		int a1=0,a2=0,b1=0,b2=0;
		boolean start1=true,start2=false,possible=true;
		int a;
		while(it.hasNext())
		{
			
			if(start1)
			{
				a=(int) it.next();				
				a1=a;
				start1=false;
				start2=true;
			} 
				if(start2){
					a=(int) it.next();
					b1=a-a1;
					b2=b1;
					a1=a;
					start2=false;
				}
			
			if(!start1&&!start2){
				a=(int) it.next();
				b1=a-a1;
				if(b1!=b2)
				{
					System.out.println(b1+" :"+b2+"");
					possible=false;
					break;
				}
				b2=b1;
				a1=a;
			}
		}
		if(possible)
		{
			System.out.print("Possible");
		}else
		{
			System.out.print("Impossible");
		}
	}

}
