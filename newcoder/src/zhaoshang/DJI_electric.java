package zhaoshang;

import java.util.Scanner;

public class DJI_electric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(get());
	}
	public static String get()
	{
		Scanner scan=new Scanner(System.in);
		int count;
		String s=scan.nextLine();
		String str[]=s.split("\\s+");
		int n=Integer.valueOf(str[0]),m=Integer.valueOf(str[1]);
		int N=n;
		int[][] A=new int[n][m],B=new int[n][m];			
		while(n-->0)
		{
			s=scan.nextLine();
			str=s.split("\\s+");
			
			int i=0;
			for(;i<m;i++)
			{
				B[N-n-1][i]=Integer.valueOf(str[i]);
				if(B[N-n-1][i]==0)
				{
					for(int j=0;j<N;j++)
					{
						A[j][i]=0;
					}
					for(int j=0;j<m;j++)
					{
						A[N-n-1][j]=0;
					}
				}else
				  A[N-n-1][i]=1;			
			}
		}
		boolean re=true,con=true;
		for(int i=0;re&&i<N;i++)		
		{
			for(int j=0;re&&j<m;j++)
			{
				con=true;
				System.out.print(A[i][j]+" ");
				if(B[i][j]==1)
				{
					System.out.print(B[i][j]+" ");
					for(int k=0;(con)&&k<N;k++)
					{
						if(A[k][j]==1)con=false;
					}
					for(int k=0;(con)&&k<m;k++)
					{
						if(A[i][k]==1)con=false;
					}
					if(con)
					  re=false;
				}
			}
		}
		if(re)
			return "YES";
		else
			return "NO";
	}
}
