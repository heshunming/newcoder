package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Offer27 {
//全排列，两种解法，其中一种是递归法如下所示，另外一种是字典法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String s:Permutation("aerwertre"))
			System.out.println(s);
	}
	public static ArrayList<String> Permutation(String str) {		
		ArrayList<String> arr=new ArrayList<>();
		
		if(str.isEmpty())
		{
			return arr;
		}
		int len=str.length();
		char[] ch=str.toCharArray();
		HashSet<String>hs=new HashSet<String>();
		per(ch,hs,0,len);
		for(String s:hs)
		{
			arr.add(s);
		}
		Collections.sort(arr);
		return arr;
	 }
	public static void per(char[] str_in,HashSet<String>hs,int k,int length)
	{
		if(k==length)
		{
			hs.add(new String(str_in));
			return;
		}
		for(int i=k;i<length;i++)
		{
			swap(str_in,i,k);
			per(str_in,hs,k+1,length);
			swap(str_in,i,k);			
		}
		
	}
	public static void swap(char[] str,int i,int j)
	{
		char ch=str[i];
		str[i]=str[j];
		str[j]=ch;
	}

}
