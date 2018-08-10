package shenxinfu;
//查找最长的字符串
public class Longchar {

	static String reg;
	static String left;
	public static void main(String[] args) {		 

		        String str=new Longchar().find("asdddddadafghjaa");  

		        System.out.println(str);  


	}
	 public static String find(String str){  

	        //最长的重复字串，极端情况就比如abcabc，最长重复字串就是abc  

	        //即为字符串长度的一半，当然这是极端情况，通常都是小于串长一半的  
		 	int in=Integer.MAX_VALUE;
		 	String s="";
		 	int length=0;
		 	for(int i=0;i<str.length();i++)
		 	{
		 		for(int j=i+1;j<str.length();j++)
		 		{
		 			reg=str.substring(i,j);
		 			left=str.substring(j);
		 			
		 			if(left.indexOf(reg)==0)
		 			{
		 				if(reg.length()>length)
		 				{
		 					length=reg.length();
		 					//s=str.substring(i,i+2*(j-1));
		 					System.out.println("reg:"+reg+"   left:"+left);
		 					s=reg;
		 				}
		 			}
		 		}
		 	} 
		 	
	        return s;  
	    }  

}
