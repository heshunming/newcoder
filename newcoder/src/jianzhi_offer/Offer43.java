package jianzhi_offer;

import java.util.ArrayDeque;

public class Offer43 {
	public static void main(String[] args) {
		
		System.out.println(LeftRotateString("abcXYZdef", 3));
	}
	public static 	String LeftRotateString(String str,int n) {		
		
		if(str==null||str.length()==0)		
			return str;
		
		ArrayDeque<Character> deque=new ArrayDeque<>();
		char[] ch=str.toCharArray();
		int i=0;
		for(;i<str.length();i++)		
			deque.addLast(ch[i]);
		
		for(i=0;i<n;i++)		
			deque.addLast(deque.removeFirst());		
		
		System.out.println(deque.size());
		str="";
		while(!deque.isEmpty())				
			str+=deque.removeFirst();			
		return str;		  
    }

}
