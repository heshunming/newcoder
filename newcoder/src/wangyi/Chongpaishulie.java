package wangyi;

import java.util.Scanner;

public class Chongpaishulie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//祖传代码，留着备用
				Scanner cin = new Scanner(System.in);   
				String t=cin.nextLine();
				int tt=Integer.valueOf(t);
				String[] str_s=new String[tt],n_s=new String[tt];
				boolean [] b_s=new boolean[tt];
				int n=tt,k=0;
				while(n>0)
				{
					n_s[tt-n]=cin.nextLine();
					str_s[tt-n]=cin.nextLine();
					n--;
					
				}
				for(int i=0;i<tt;i++)
				{
					int nt=Integer.valueOf(n_s[i]);
					String[] str=str_s[i].split(" ");
					int arr_s[]=new int[tt];
					int count2=0,count4=0;
					for(int k1=0;k1<tt;k1++)
					{
						arr_s[k1]=Integer.valueOf(str[k1]);
						if(arr_s[k1]%2==0&&arr_s[k1]%4!=0)
						{
							count2++;
						}
						if(arr_s[k1]%4==0)
						{
							count4++;
						}
					}
					if((nt-2*count4-1-2*count2)>0)
					{
						b_s[i]=false;
					}
					else
					{
						b_s[i]=true;
					}
					
				}
				for(boolean b:b_s)
				{
					System.out.println(b);
				}
				
	}

}
