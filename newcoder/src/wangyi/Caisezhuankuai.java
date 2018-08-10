package wangyi;

import java.util.LinkedList;
import java.util.Scanner;

public class Caisezhuankuai {

	//Å£¿ÍÍøÒ×£º²ÊÉ«×©¿é
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);   
		String str=cin.nextLine();
		char[] ch_array=str.toCharArray();
		char a=ch_array[0],b=ch_array[0];
		boolean find=false,error=false;
		int n=1;
		for(int i=0;i<ch_array.length;i++)
		{
			if(find==false&&a!=ch_array[i])
			{
				b=ch_array[i];
				n=2;
				find=true;
			}
			if(find&&!error&&(ch_array[i]!=a&&ch_array[i]!=b))
			{
				n=0;
				break;
			}
		
		}
		System.out.print(n);;
	}

}
