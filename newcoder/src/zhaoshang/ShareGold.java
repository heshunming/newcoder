package zhaoshang;

import java.util.ArrayList;
import java.util.Scanner;

public class ShareGold {

	public static void main(String[] args) 
	{		
		sharegold();
	}
	static void sharegold()
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int N=t;
		while(t-->0){
		
			int n;			
			n=scan.nextInt();
			int[][] dp = new int[n+1][n+1];//dp[x][y]保存第x堆到第y堆的最优解  
	        int[] a = new int[n+1];//每堆金矿含金量.  
	        int[] sum = new int[n+1];//n堆金矿总含金量.  
			for(int i=1;i<=n;i++){
				a[i]=scan.nextInt();
				sum[i]=sum[i-1]+a[i];
				dp[i][i]=a[i];
			}
			for(int i=1;i<=n;i++){
				for(int j=1;j+i<=n;j++){
					int t_sum=sum[i+j]-sum[j-1];
					int min_gold=Integer.min(dp[j+1][i+j], dp[j][i+j-1]);
					dp[j][j+i]=t_sum-min_gold;
				}				
			}
//			for(int i=0;i<=n;i++){
//				for(int j=0;j<=n;j++)
//					System.out.print(dp[i][j]+" ");
//				System.out.println();
//			}
			System.out.println("Case #"+(N-t)+": "+dp[1][n]+" "+(sum[n]-dp[1][n]));
		}
		
		
	}
}
