package jianzhi_offer;

public class Offer52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] str={'a','a','a'};
		char[] pattern="ab*ac*a".toCharArray();
		System.out.println(match(str,pattern));
	}
	public  static	boolean match(char[] str, char[] pattern)
    {
		
		String s=new String(str);
		String p=new String(pattern);
		
		return s.matches(p);     
    }

}
