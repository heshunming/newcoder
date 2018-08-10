package algorothm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EightQuence {

	static ArrayList<String>list=new ArrayList<>();
	static HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	public static void main(String[] args) {		
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    search(n,0);
	    System.out.println(tot);	
	    for(String s:list)
	    	System.out.println(s);

	}
	static int  tot = 0;
	static int col[]=new int[50];

	static void  search(int n, int cur)
	{
	    int i,j,ok;

	    if(cur == n)  //行数达到最大
	    {
	        tot++;
	        String s="";
	        for(int e=0;e<n;e++)
	        	s+=map.get(e);
	        list.add(s);
	    }
	    else
	    {
	        for(i=0; i<n; i++)  //列
	        {
	            ok = 1;         //放置标志位
	            col[cur] = i;   //尝试将第cur行的皇后放在第i列

	            for(j=0; j<cur; j++)  //从第0行开始到cur-1行，检查是否和前面的皇后有冲突
	            {
	                if(col[cur] == col[j] ||        //在同一列
	                   cur-col[cur] == j-col[j] ||  //主对角线
	                   cur+col[cur] == j+col[j] )   //副对角线
	                	{
	                		ok = 0;
	                		break;   //当前i列存在冲突,换下一列
	                	}
	            }
	            if(ok>0)  //如果当前行cur找到放置点后，继续下一行的放置
	            {
	            	map.put(j,i);
	                search(n,cur+1);
	                map.remove(j);
	            }
	        }
	    }
	}

}
