package wangyi;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n_str=in.nextLine();
        String x1_str=in.nextLine();
        String x2_str=in.nextLine();
        String y1_str=in.nextLine();
        String y2_str=in.nextLine();
        int num=1;
        int n=Integer.valueOf(n_str);
        String[] x1_s=x1_str.split(" ");
        String[] x2_s=x1_str.split(" ");
        String[] y1_s=x1_str.split(" ");
        String[] y2_s=x1_str.split(" ");
         
        int[] x1=new int[n];
        int[] x2=new int[n];
        int[] y1=new int[n];
        int[] y2=new int[n];
        for(int i=0;i<n;i++)
        {
        	x1[i]=Integer.valueOf(x1_s[i]);
        	x2[i]=Integer.valueOf(x2_s[i]);
        	y1[i]=Integer.valueOf(y1_s[i]);
        	y2[i]=Integer.valueOf(y2_s[i]);
        }
        
        for(int j=0;j<n;j++)
        {
        	for(int k=j+1;j<n;j++)
        	{
        		if(x1[j]==x1[k]&&x2[j]==x2[k])
        		{
        			num++;
        		}
        		//if(x)
        		{
        			
        		}
        	}
        }
        /*while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }*/
        
    }
}