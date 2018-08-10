package jianzhi_offer;

import java.util.ArrayList;

public class Offer31 {
//有多少个数1，leetcode和编程之美上面都有
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1Between1AndN_Solution(12));	}
	
	

			  public static int NumberOf1Between1AndN_Solution(int n) 
			  {
			 
				  ArrayList<Integer>list=new ArrayList<Integer>();
				  int temp=n,lea,count=0;
				  if(n<=0)
					  return 0;
				  if(n<=9)
				  {
					  return 1;
				  }
				  while(temp!=0)
				  {
					  lea=temp%10;
					  list.add(lea);
					  temp=temp/10;
				  }
				  int i,len=list.size();
				  for(i=0;i<len;i++)
				  {
					  int t=0,num;
					  t=list.get(i);

					  {
						  if(t==0)
						  {	   
							  num=(int)(n/(int)Math.pow(10, i+1));
							  count=count+num*((int)Math.pow(10,i));
						  }else if(t>1)
						  {
							  
							  num=(int)(n/(int)Math.pow(10, i+1));
							  count=count+(num+1)*((int)Math.pow(10,i));
						  }else if(t==1)
						  {	
							  int left=(int)(n%(int)Math.pow(10, i));
							  num=(int)(n/(int)Math.pow(10, i+1));
							  count=count+num*((int)Math.pow(10,i))+left+1;
						  }
					  }
				  }
				  return count;
//				  int count = 0;//1的个数
//			    int i = 1;//当前位
//			    int current = 0,after = 0,before = 0;
//			    while((n/i)!= 0)
//			    {
//			    	before = n/(i*10); //当前位数字
//			         after = n-(n/i)*i; //低位数字
//			         //如果为0,出现1的次数由高位决定,等于高位数字 * 当前位数
//			     if (current == 0)
//			            count += before*i;
//			     //如果为1,出现1的次数由高位和低位决定,高位*当前位+低位+1
//			    else if(current == 1)
//			           count += before * i + after + 1;
//			     //如果大于1,出现1的次数由高位决定,//（高位数字+1）* 当前位数
//			    else{
//			    	count += (before + 1) * i;
//			    	}     //前移一位
//			     	i = i*10;
//			      }
//			    	return count;
			   }   
	 
	 

}
