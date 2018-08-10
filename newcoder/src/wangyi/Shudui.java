package wangyi;

import java.util.Scanner;

public class Shudui {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String [] nk=str.split(" ");
        Long n=Long.valueOf(nk[0]);
        Long k=Long.valueOf(nk[1]);
        Long num = 0L;
        for(Long x=k;x<=n;x++)
        {
        	for(Long y=k+1;y<=n;y++)
        	{
        		if(x%y>=k)
        		{
        			num++;
        		}
        	}
        }
        System.out.print(num);
    }
}
