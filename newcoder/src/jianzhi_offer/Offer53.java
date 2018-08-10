package jianzhi_offer;
//字符串是否表示数值
public class Offer53 {

	public static void main(String[] args) {		
		String str="1+23";
		char[] ch=str.toCharArray();
		System.out.println(isNumeric(ch));
		//System.out.println(Integer.valueOf("0.56"));
	}
	public static boolean isNumeric(char[] str) 
	{
		if(str.length==0||str[0]=='e'||str[0]=='E'||str[str.length-1]=='e'||str[str.length-1]=='E')
		{
			System.out.println("字符串前面含有e");
			return false;
		}
		String regex="^[-+Ee0-9.]{1,40}$";
		String st=new String(str);
		String[] strs;
		if(!st.matches(regex))
		{
			System.out.println("含有其他字符");
			return false;
		}
		if(st.contains("e")||st.contains("E"))
		{			
			System.out.println(st);
			strs=st.split("e|E");
			if(strs.length>2)
			{
				System.out.println("含有两个以上的e"+strs.length);
				return false;
				
			}
			try{
				
				double d1=Double.valueOf(strs[0]);				
				int d2=Integer.valueOf(strs[1]);
			}catch(Exception e){
				System.out.println("转换出错");
				return false;
			}
		}else
		{
			try{
				
				double d1=Double.valueOf(st);				
				
			}catch(Exception e){
				System.out.println("转换出错");
				return false;
			}
		}		
		return true;        
    }
}
