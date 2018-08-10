package jianzhi_offer;
//不能用四则运算符号计算加法，可以用逻辑运算符啊
public class Offer48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Add(111,899));
	}
	 public static int Add(int num1,int num2) {		
		int s1;//两位数相与，求得二进制相加时需要进位的部分的值		
		int s2;//两个数之间求异或		
		while(true)
		{
			s1=(num1&num2)<<1;
			s2=num1^num2;
			if((s1&s2)==0)
			{
				return s1|s2;
			}
			num1=(s1&s2)<<1;
			num2=s1^s2;
			if((num1&num2)==0)
			{
				return num1|num2;
			}
		}
		        
	  }

}
