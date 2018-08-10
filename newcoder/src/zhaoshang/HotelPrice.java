package zhaoshang;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelPrice {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);	
		String s;
		while(scan.hasNext())
		{
			s=scan.nextLine();
			if(list.contains(s)){				
			}else
			list.add(scan.nextLine());
		}
		int len=list.size();
		int[][]array=new int[len][3];
		for(int i=0;i<len;i++)
		{
			String []str=list.get(i).split("\\s+");
			array[i][0]=Integer.valueOf(str[0]);
			array[i][1]=Integer.valueOf(str[1]);
			array[i][2]=Integer.valueOf(str[2]);
		}
		
		
	}

}
