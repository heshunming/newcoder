package shenxinfu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    String Nu=sc.nextLine();
	    String str=sc.nextLine();
	    int n;
	    n=Integer.valueOf(Nu);
	    String[] strs=str.split(" ");
	    int arr[]=new int[strs.length];
		for(int i=0;i<strs.length;i++)
		{
			arr[i]=Integer.valueOf(strs[i]);
		}
		//int[] arr1={3,3,1,2};
	//	arr=arr1;
		n=arr.length;
		
		boolean flag=false;
		int count=0;
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=0;
			
			for(j=i;j>0&&temp<arr[j-1];i--)
			{
				arr[j]=arr[j-1];
				flag=true;
			}
			arr[j]=temp;
			if(flag)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
