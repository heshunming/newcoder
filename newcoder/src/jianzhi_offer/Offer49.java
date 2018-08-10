package jianzhi_offer;
import java.util.ArrayDeque;
public class Offer49 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StrToInt("-000130"));
	}
	public static  int StrToInt(String str) {		
				
		char[] array=str.toCharArray();
		int signal=1,mul=1,sum=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[0]=='+'||array[0]=='-')
			{
				if(array[0]=='-')
					signal=-1;
				continue;
			}
			if(array[i]<'0'||array[i]>'9')
			{
				return 0;
			}
		}
		ArrayDeque<Character> deque=new ArrayDeque<>();
		for(char c:array)
		{
			if(c!='-'&&c!='+')			
				deque.addLast(c);
		}		
		
		while(!deque.isEmpty())
		{
			sum+=mul*(deque.removeLast()-'0');
			mul*=10;			
		}		
		return (signal)*sum;        
    }

}
