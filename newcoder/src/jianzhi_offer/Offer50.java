package jianzhi_offer;

import java.util.HashSet;
import java.util.Random;
//shit一样的题目
public class Offer50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={};
		int []a = new int[5];
		duplicate(array,5,a);
		System.out.println(a[0]);
	}
	// Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
		
    	if ( numbers==null ) return false;

		// 判断数组是否合法（每个数都在0~n-1之间）
			for ( int i=0; i<length; i++ )
			 {
				if ( numbers[i]<0 || numbers[i]>length-1 ) 
				{
    				return false;
				}
			}
    	//else if()
    	HashSet<Integer>hs1=new HashSet<Integer>(),hs2=new HashSet<>();
    	for(int i:numbers)
    	{
    		
    		if(hs1.contains(i))
    		{
    			hs2.add(i);
    		}
    		hs1.add(i);
    	}
    
    	if(hs2.isEmpty())
    	{
    		return false;
    	}
    
    	
    	/*随机数种子，三种方式产生：
    	 * 1、System.currentTimeMills
    	 * 2、Math.random()返回0到1之间的小数
    	 * 3、Random random = new Random();//默认构造方法
    	 * 	   种子数相同，所产生的随机数也就是相同
		 *   Random random = new Random(1000);//指定种子数字
		 *   int i2 = random.nextInt(100);
    	 * *
    	 * 
    	 * 
    	 * 
    	 *  public boolean duplicate(int numbers[],int length,int [] duplication) 
    	 *  {
      
				if ( numbers==null ) return false;

    			// 判断数组是否合法（每个数都在0~n-1之间）
    				for ( int i=0; i<length; i++ )
    				 {
        				if ( numbers[i]<0 || numbers[i]>length-1 ) 
        				{
            				return false;
        				}
    				}

    		// key step
    			int[] hash = new int[length];
    			for( int i=0; i<length; i++ )
    			{
        			hash[numbers[i]]++;
    			}
    			for(int i=0; i<length; i++)
    			{
        			if ( hash[i]>1 ) 
        			{
            			duplication[0] = i;
            			return true;
        			}
    			}
    			return false;
    		}
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 */
    	Object[] obj=hs2.toArray();
    	for(Object o:obj)
    	{
    		System.out.print(" "+(int)o);
    	}
    	int len=obj.length;
    	Random r1=new Random();
    	int x=r1.nextInt(len);
    	duplication[0]=(int)obj[x];    
    	return true;    
    }

}
