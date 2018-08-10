package test.pingduoduo;

import java.util.Scanner;

public class PrintChar {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int len=s.length();
		int k=len/4;
		for(int i=0;i<=k;i++)
		{
			if(i==0){
				System.out.println(s.substring(0, k+1));
				continue;
			}
			if(i==k){
				String s1=s.substring(2*k,3*k+1);
				for(int j=s1.length();j>0;j--){						
					System.out.print(s1.substring(j-1,j));		
				}			
				continue;
			}
			System.out.print(s.substring(len-i, len-i+1));
			int j=k-1;
			while(j-->0)
				System.out.print(" ");
			System.out.println(s.substring(k+i, k+1+i));
		}

	}

}
