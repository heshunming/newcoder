package wangyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Jiaocuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String [] str_str=str.split("11|00");
		int size=str_str.length,i=0;
		int [] str_len = new int[size];
		ArrayList<Integer> array=new ArrayList<Integer>();
		int start = 0,end = 0;
		boolean start_flag=false,end_flag=true;
		while(i<str.length()-1)
		{
			if((str.charAt(i)!=str.charAt(i+1))&&(!start_flag))
			{
				start_flag=true;
				start=i;
				end_flag=false;
			}else if((str.charAt(i)==str.charAt(i+1))&&(start_flag)&&!end_flag)
			{
				end=i;
				start_flag=false;
				end_flag=true;
				array.add(end-start+1);
			}
            if((start_flag)&&!end_flag&&i==str.length()-2)
			{
				end=i+1;
				start_flag=false;
				end_flag=true;
				array.add(end-start+1);
			}
			i++;
		}
		/*while(i<size-1)
		{
			index=str.indexOf(str_str[i]);
			str_len[i]=str_str[i].length();
			if(index!=0&&(str.charAt(index)!=str.charAt(index-1)))
			{
				str_len[i]++;
			}
			if((index+str_str[i].length())!=str.length()&&(str.charAt(index+str_str[i].length()-1)!=str.charAt(index+str_str[i].length())))
			{
				str_len[i]++;
			}
			//System.out.println(str_str[i]);	
			
			array.add(str_len[i]);
			i++;
		}
		//ArrayList<Integer> array=new ArrayList<Integer>();
		Iterator it=array.iterator();
		//while()*/
		if(array!=null&&array.size()>0)
		{
			Collections.sort(array);
			System.out.println(array.get(array.size()-1));
		}
		else
		{
			System.out.println(1);
		}
		
		
	}
	


}