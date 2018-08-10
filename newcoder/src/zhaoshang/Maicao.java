package zhaoshang;

import java.util.ArrayList;
import java.util.Scanner;

public class Maicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		
		String t_str=in.nextLine();
		int t=Integer.valueOf(t_str);
		String [] arr_str=new String[t];
		int i=0;
		String [] num_str=new String[t];
		int tt=t;
		while(tt-->0)
		{
			num_str[i]=in.nextLine();
			arr_str[i]=in.nextLine();
			i++;
		}
		int [][] arr=new int[t][1024];
		String []str;
		int len;
		for(int i1=0;i1<t;i1++ )
		{
			//System.out.println(arr_str[i1]);
			str=arr_str[i1].split(" ");
			len=Integer.valueOf(num_str[i1]);
			for(int j1=0;j1<str.length;j1++)
			{
				arr[i1][j1]=Integer.valueOf(str[j1]);
			}
				
		}
	ArrayList<Integer> result=new ArrayList<Integer>();
	int []temp;
	for(int t0=0;t0<arr.length;t0++){
		//for(int kk=0;kk<arr[t0].length;kk++)
			{
			//temp[kk]=arr[t0][kk];
			}
			System.out.println(maxSum(arr[t0],arr[t0].length));
		}
	//	int []arr1={12,16,10,5};
		//System.out.println(maxSum(arr1,4));
	}
	
	public static int maxSum(int[] arr, int size)
	{
	        if(size<=0)
	                return 0;
	        else if(size ==1)
	                return arr[0];

	        int excl = 0, incl = arr[0];
	        int excl_new;
	        for(int i = 1; i<size; ++i)
	        {
	                excl_new = (excl>incl)?excl:incl;
	                incl = excl + arr[i];
	                excl = excl_new;
	        }
	        return (incl>excl)?incl:excl;
	}


}
